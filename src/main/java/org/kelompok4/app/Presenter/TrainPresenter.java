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
        trainController.trainMenuView();
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
            //true adalah train inputan user tidak ada di json
            if(trainController.validateCodeTrain()){
                trainController.create();
                trainModels.add(new TrainModel(trainController.getTrainCode(),trainController.getTrainName(),trainController.getSizeOfBC(),trainController.getSizeOfPC(),trainController.getCoachs()));
                trainController.resultView();
                trainController.resultAddTrain(valid);
                pressEnterKey();
                run();
            }else{
                trainController.resultView();
                System.out.println("KERETA gagal ditambahkan, Kode KAI sudah Terdaftar");
            }

        }
    }
    public void showTable(){
        trainController.trainTable(trainController.allTrainView(trainModels));
    }
    public void showTrain() {
        trainController.showTrainView();
        showTable();
        pressEnterKey();
        run();
    }
    public void updateTrain() {
        boolean valid;
        String input;
        do {
            showTable();
            trainController.editTrainView();
            input = sc.nextLine();
            valid = trainController.validateInputTrain(input);
            if(!input.equals("99")&&!valid){
                trainController.resultEditTrain(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(!trainController.validateCodeTrain()){
                trainController.update();
                //trainModels.add(new TrainModel(trainController.getTrainCode(),trainController.getTrainName(),trainController.getSizeOfBC(),trainController.getSizeOfPC(),trainController.getCoachs()));
                trainController.resultView();
                trainController.resultEditTrain(valid);
                showTrain();
                pressEnterKey();
                run();
            }else{
                trainController.resultView();
                System.out.println("KERETA gagal diedit, Kode KAI sudah tidak ada didatabase");
            }
        }
    }
    public void delTrain() {
        boolean valid;
        String input;
        do {
            showTable();
            trainController.deleteTrainView();
            input = sc.nextLine();
            trainController.setTrainCode(input);
            valid = trainController.validateCodeTrain();
            if(!input.equals("99")&&!valid){
                trainController.resultDeleteTrain(valid);
                pressEnterKey();
            }
        }while(!valid && !input.equals("99"));
        if(input.equals("99")){
            run();
        } else if(valid){
            if(!trainController.validateCodeTrain()){
                trainController.delete();
                trainController.resultView();
                trainController.resultDeleteTrain(valid);
                pressEnterKey();
                run();
            }else{
                trainController.resultView();
                System.out.println("KERETA gagal dihapus, Kode KAI tidak ada didatabase");
            }
        }
    }

}
