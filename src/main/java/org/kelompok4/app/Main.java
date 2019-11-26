package org.kelompok4.app;

import com.github.freva.asciitable.AsciiTable;
import org.kelompok4.app.Controller.*;
import org.kelompok4.app.Model.*;
import org.kelompok4.app.Presenter.LoginPresenter;
import org.kelompok4.app.Presenter.RegisterPresenter;
import org.kelompok4.app.Presenter.RouteTimePresenter;
import org.kelompok4.app.Presenter.RouteTrainPresenter;
import org.kelompok4.app.Presenter.RwRoutePresenter;
import org.kelompok4.app.Presenter.TrainPresenter;
import org.kelompok4.app.Presenter.TrainSchedulePresenter;
import org.kelompok4.app.View.*;
import org.kelompok4.app.Repo.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.kelompok4.app.Presenter.AdminMenuPresenter;
import org.kelompok4.app.Presenter.CustomerMenuPresenter;
import org.kelompok4.app.Presenter.MenuPresenter;
import org.kelompok4.app.Presenter.TimePresenter;

public class Main {
	public Main() {

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		RouteTimePresenter routeTimePresenter = new RouteTimePresenter(
				new RouteTimeController(new RouteTimeModel(), new RouteTimeView()));
		RouteTrainPresenter routeTrainPresenter = new RouteTrainPresenter(
				new RouteTrainController(new RouteTrainModel(), new RouteTrainView()));
		TrainSchedulePresenter trainSchedulePresenter = new TrainSchedulePresenter(
				new TrainScheduleController(new TrainScheduleModel(), new TrainScheduleView()));
		
		// routeTimePresenter.run();
		// routeTrainPresenter.run();
		trainSchedulePresenter.run();
	}

}
