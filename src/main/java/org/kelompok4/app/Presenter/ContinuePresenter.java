package org.kelompok4.app.Presenter;

import org.kelompok4.app.Interface.ICanInput;

public class ContinuePresenter implements ICanInput {
    public void pressEnterKey(){
        System.out.print("Press Enter key to continue . . . ");
        sc.nextLine();
    }
}
