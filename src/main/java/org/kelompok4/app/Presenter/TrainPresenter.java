package org.kelompok4.app.Presenter;

import org.kelompok4.app.Controller.TrainController;
import org.kelompok4.app.Interface.ICanRun;

public class TrainPresenter extends ContinuePresenter implements ICanRun {
    TrainController trainController;

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
        menu(sc.nextInt());
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
            trainController.addTrain();
            input = sc.nextLine();
            valid = trainController.validateInputTrain(input);
//            trainController.resultAddTrain(valid);
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            trainController.create();
            trainController.resultAddTrain(valid);
        }
    }
    public void showTrain() {
    }
    public void updateTrain() {
    }
    public void delTrain() {
    }
}
