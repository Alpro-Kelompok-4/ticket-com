package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TrainController;
import org.kelompok4.app.Interface.ICanRun;
import org.kelompok4.app.Model.TrainModel;

import java.util.ArrayList;

public class TrainPresenter extends ContinuePresenter implements ICanRun {
    TrainController trainController;
    ArrayList<TrainModel> trainModels = new ArrayList<TrainModel>();

    public TrainPresenter(TrainController trainController) {
        this.trainController = trainController;
    }

    public TrainController getTrainController() {
        return trainController;
    }

    public void setTrainController(TrainController trainController) {
        this.trainController = trainController;
    }

    @Override
    public void run() {
        trainController.getTrainView().printTrainMenu();
        int menu =sc.nextInt();
        sc.nextLine();
        menu(menu);
    }

    public void menu(int choice){
        switch (choice){
            case 1:
                addTrain();
                break;
            case 2:
                showTrain();
                break;
            case 3:
                updateTrain();
                break;
            case 4:
                delTrain();
                break;
        }
    }

    public void addTrain() {
        boolean valid;
        String input;
        do {

            trainController.addTrainView();
            input = sc.nextLine();
            valid = trainController.validateInputTrain(input);
            if(!input.equals("99")&&!valid){
                trainController.resultAddTrain(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            trainController.create();
            trainModels.add(trainController.getTrainModel());
            System.out.println(trainModels.size());
            trainController.resultView();
//            System.out.println(trainController.getTrainModel().getTrainName());
            trainController.resultAddTrain(valid);
            showTrain();
            pressEnterKey();
            addTrain();
        }
    }
    public void showTrain() {
        System.out.println(trainController.allTrainView(trainModels));
    }
    public void updateTrain() {
    }
    public void delTrain() {
    }

}
