//Author@gayuh

public class ReportView {

    public ReportView() {

    }

    public void MenuReport(){
        System.out.println("#LAPORAN PEMASUKAN#");
        System.out.println("1.  Laporan Harian ");
        System.out.println("2.  Laporan Bulanan");
        System.out.println("3.  Laporan Tahunan");
        System.out.println("99. Main Menu ");
        System.out.println(" ");
        System.out.println("Pilih Menu : ");
        System.out.println(" ");	

    }

    public void printDailyReportPage() {
        System.out.println("#LAPORAN HARIAN PEMASUKAN# ");
        System.out.println("");
        System.out.println("");
    }

    public void printHeaderDailyReport() {
        System.out.println("Data Pemasukan Harian ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printTotalDailyReport() {
        System.out.println("Total Masukan Harian ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printMonthlyReportPage() {
        System.out.println("#LAPORAN BULANAN PEMASUKAN# ");
        System.out.println("");
        System.out.println("");
    }

    public void printHeaderMonthlyReport() {
        System.out.println("Data Pemasukan Bulanan ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printTotalMonthlyReport() {
        System.out.println("Total Masukan Bulanan ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }
    public void printAnualReportPage() {
        System.out.println("#LAPORAN TAHUNAN PEMASUKAN# ");
        System.out.println("");
        System.out.println("");
    }

    public void printHeaderAnualReport() {
        System.out.println("Data Pemasukan Tahunan ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printTotalAnualReport() {
        System.out.println("Total Masukan Tahunan ");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
    }

    public void printDateReport() {
        System.out.print("Masukkan tanggal pencarian : ");
        System.out.flush();
    }

    public void printFormatDateReport(String formatDate) {
        System.out.print("Masukkan tanggal pencarian : ");
        System.out.println("");
        System.out.flush();
    }

    public void failedValidateDateReport() {
        System.out.println("Format tanggal yang Anda masukkan salah!");
        System.out.flush();
    }
    
}

