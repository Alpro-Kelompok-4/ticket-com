package org.kelompok4.app.Controller;

import java.util.ArrayList;

import com.github.freva.asciitable.AsciiTable;

import org.apache.commons.lang3.RandomStringUtils;
import org.kelompok4.app.Interface.ICanCreate;
import org.kelompok4.app.Interface.ICanDelete;
import org.kelompok4.app.Model.BookingModel;
import org.kelompok4.app.Model.BookingStatus;
import org.kelompok4.app.Model.CityModel;
import org.kelompok4.app.Model.TrainModel;
import org.kelompok4.app.Model.CoachModel;
import org.kelompok4.app.Model.SeatModel;
import org.kelompok4.app.Model.PriceModel;
import org.kelompok4.app.Model.RouteModel;
import org.kelompok4.app.Model.TrainScheduleModel;
import org.kelompok4.app.Repo.BookingRepo;
import org.kelompok4.app.Repo.CityRepo;
import org.kelompok4.app.Repo.TrainRepo;
import org.kelompok4.app.Repo.TrainScheduleRepo;
import org.kelompok4.app.View.BookingView;

public class BookingController implements ICanCreate, ICanDelete{
    private BookingRepo repo = new BookingRepo();
    private BookingModel model;
    private BookingView view;
    private TrainScheduleModel schedule;
    private RouteModel route;
    private TrainModel train;

    public BookingController() {
        model = new BookingModel();
        view = new BookingView();
        schedule = new TrainScheduleModel();
        route = new RouteModel();
    }

    public BookingController(BookingModel model, BookingView view) {
        this.model = model;
        this.view = view;
    }

    public void getBookingDetail() {
        schedule = new TrainScheduleRepo().get(model.getScheduleCode());
        route = schedule.getRwRouteModel().getRoute();
        train = schedule.getTrainModel();
    }

    public String getBookingCode() {
        return model.getBookingCode();
    }

    public void setBookingCode(String code) {
        model.setBookingCode(code);
    }

    public String getScheduleCode() {
        return model.getScheduleCode();
    }

    public void setScheduleCode(String code) {
        model.setScheduleCode(code);
    }

    public String getTrainCode() {
        return model.getTrainCode();
    }

    public void setTrainCode() {
        String code = train.getTrainCode();
        model.setTrainCode(code);
    }

    public String getVirtualAccount() {
        return model.getVirtualAccount();
    }

    public void setVirtualAccount(String account) {
        model.setVirtualAccount(account);
    }

    public ArrayList<String> getPassenger() {
        return model.getPassenger();
    }

    public void setPassenger(ArrayList<String> pList) {
        model.setPassenger(pList);
    }

    public ArrayList<String> getSeatCode() {
        return model.getSeatCode();
    }

    public void setSeatCode(ArrayList<String> seatList) {
        model.setSeatCode(seatList);
    }

    public PriceModel getTotalPayment() {
        return model.getTotalPayment();
    }

    public void setTotalPayment(PriceModel tot) {
        model.setTotalPayment(tot);
    }

    public void setPaid() {
        model.setPaid(BookingStatus.PAID);
    }

    public void setExpired() {
        model.setPaid(BookingStatus.EXPIRED);
    }

    public void setUnpaid() {
        model.setPaid(BookingStatus.UNPAID);
    }

	public void bookingMenuView() {
        view.printBookingViewPage();
    }

    public void bookingScheduleView() {
        view.printScheduleCode();
    }

    public void showCheckFailed() {
        view.failedValidateScheduleCode();
    }

    public void totalCustomerView() {
        view.printTotalCustomer();
    }

    public void customerInputView(int i) {
        view.printCustomerName(i);
    }

    public void seatInputView(int i) {
        view.printCustomerSeat(i);
    }

    public void showSeatInput() {
        view.printBookingSeatViewPage();
    }

    public void showBorder() {
        view.printBorder();
    }

    public void showSearchScheduleMenu() {
        view.printCariBookingView();
    }

    public void showOriginInput() {
        view.printOrigin();
    }

    public void showDestinationInput() {
        view.printDestination();
    }

    public void showDepartureDateInput() {
        view.printDepartureDate();
    }

    public void showBookingMenu() {
        view.printBookingMenu();
    }

    public void showBookingPaymentMenu() {
        view.printBookingPaymentMenu();
    }

    public void showResultSearchSchedule(String ori, String des, String date) {
        ArrayList<CityModel> citys = new CityRepo().getAll();
        String origin = "";
        String destination = "";
        for (CityModel city : citys) {
            if (city)
        }

        String route = origin.getCityCode() + "-" + destination.getCityCode();

        ArrayList<TrainScheduleModel> schedules = new ArrayList<>();
        schedules = new TrainScheduleController().findTrainSchedule(route, date);
        System.out.println(new TrainScheduleController().allTrainScheduleView(schedules));
    }
    
    public void showBooking() {
        view.printTotalPayment(model.getTotalPayment().getPrice());
        view.printRecNumber(model.getVirtualAccount());
        showBorder();
    }

    public void generateVirtualAccount() {
        String va = RandomStringUtils.randomNumeric(12);
        model.setVirtualAccount(va);
    }

    public void generateBookingCode() {
        String code = RandomStringUtils.randomAlphanumeric(6);
        model.setBookingCode(code);
    }

    public void sumOfPayment() {
        
        double bp = route.getBusiness().getPrice();
        double pp = route.getPremium().getPrice();
        double sum = 0.0;

        for (String s : model.getSeatCode()) {
            if (s.substring(0, 1).equals("B")) {
                sum += bp;
            } else if (s.substring(0, 1).equals("P")) {
                sum += pp;
            }
        }
        setTotalPayment(new PriceModel(sum));
    }

    public void showPayment() {
        view.printPaymentViewPage();
    }

    public void showPaymentAccount() {
        view.printRecNumber();
    }

    public void showPaymentPrice() {
        view.printTotalPayment();
    }

    public void showPaymentCheck() {
        view.printPayment();
    }

    public void showFinalBooking() {
        showBorder();
        view.printBookingCode(model.getBookingCode());
        for (int i = 1; i <= model.getPassenger().size(); i++) {
            view.printCustomerName(i);
            System.out.println(model.getPassenger().get(i-1));
        }
        showBorder();
    }

    public boolean checkSchedule(String code) {
        ArrayList<TrainScheduleModel> scheduleList = new TrainScheduleRepo().getAll();
        boolean check = false;
        for (TrainScheduleModel trainScheduleModel : scheduleList) {
            if (code.equals(trainScheduleModel.getScheduleCode())) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean checkAvailableSeat(int n) {
        int totAvailable = 0;
        for (CoachModel coach : train.getCoachs()) {
            int available = coach.getSeatQty();
            for (SeatModel seat : coach.getSeat()) {
                available -= seat.getStatus();
            }
            totAvailable += available;
        }

        return n <= totAvailable;
    }

    public void printCheckAvailableSeatResult() {
        view.failedValidateTotalCustomer();
    }

    public SeatModel getSeatBySeatCode(String seatCode) {
        int bCount = train.getSizeOfBC();
        String coachType = seatCode.substring(0,1);
        int coachNum = Integer.parseInt(seatCode.substring(1,2));
        int seatNum = Integer.parseInt(seatCode.substring(3));
        // Mendapatkan dari gerbong dan kursi yg dipilih
        if ("B".equals(coachType)) {
            return train.getCoachs().get(coachNum-1).getSeat().get(seatNum-1);
        } else {
            return train.getCoachs().get(bCount+coachNum-1).getSeat().get(seatNum-1);
        }
    }
    
    public boolean checkSeat(String seatCode) {
        SeatModel seat = getSeatBySeatCode(seatCode);
        return seat.getStatus() != 1;
    }

    public void printCheckSeatResultFull() {
        view.printBookingSeatFilled();
    }

    public void bookSeat() {
        for (String seatCode : model.getSeatCode()) {
            int bCount = train.getSizeOfBC();
            String coachType = seatCode.substring(0,1);
            int coachNum = Integer.parseInt(seatCode.substring(1,2));
            int seatNum = Integer.parseInt(seatCode.substring(3));
            // Mendapatkan dari gerbong dan kursi yg dipilih
            if ("B".equals(coachType)) {
                train.getCoachs().get(coachNum-1).getSeat().get(seatNum-1).setStatus(1);
            } else {
                train.getCoachs().get(bCount+coachNum-1).getSeat().get(seatNum-1).setStatus(1);
            }
        }
        schedule.setTrainModel(train);
        new TrainScheduleRepo().update(schedule);
        new TrainRepo().update(train);
    }

    public boolean checkPayment(String account, double price) {
        if (model.getVirtualAccount().equals(account) && model.getTotalPayment().getPrice() == price) {
            view.SuccessPayment();
            return true;
        } else {
            view.FailedPayment();
            return false;
        }
    }
    
    // Mendapatkan nama gerbong (Gerbong Business 1, dll)
    public ArrayList<String> coachToString(ArrayList<CoachModel> coachs) {
        ArrayList<String> coachName = new ArrayList<>();
        int bCount = 0; // sbg nomor gerbong bisnis
        int pCount = 0; // sbg nomor gerbong premium
        for (CoachModel coach : coachs) {
            if (coach.getSeatQty() == 10) {
                bCount++;
                coachName.add("Gerbong Bisnis " + bCount);
            } else {
                pCount++;
                coachName.add("Gerbong Premium " + pCount);
            }
        }
        return coachName;
    }

    // Mendapatkan String ascii table untuk tampilan kursi
    public String seatToString(CoachModel coach, int coachNo) {
        String type;    // jenis gerbong
        if (coach.getSeatQty() == 10) {
            type = "B" + coachNo;
        } else {
            type = "P" + coachNo;
        }
        
        int row = coach.getSeatQty() / 10;
        String[][] seatList = new String[row][10];

        int index = 0;
        SeatModel seat;
        String number;  // nomor kursi
        String status;  // status kursi (0=E, 1=F)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < row; j++) {
                seat = coach.getSeat().get(index);
                number = type + "-" + seat.getNumber();
                status = (seat.getStatus() == 0) ? "E" : "F";
                seatList[j][i] = number + " " + status;
                index++;
            }
        }
        
        return AsciiTable.getTable(seatList);
    }

    public void showCoachSeat() {
        showBorder();
        ArrayList<String> coachName = coachToString(train.getCoachs());
        int index = 0;
        int coachNum;
        String name;
        for (CoachModel coach : train.getCoachs()) {
            name = coachName.get(index);
            coachNum = Integer.parseInt(name.substring(name.length()-1));
            view.printCoachSeatList(name, seatToString(coach, coachNum));
            index++;
        }
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        repo.delete(model);
    }

    @Override
    public void create() {
        // TODO Auto-generated method stub
        repo.create(model);
    }

}
