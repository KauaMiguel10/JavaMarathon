package Academy.DevDojo.JavaMarathon.Javacore.KEnum.Domain;

public enum TypeClient {
    INDIVIDUAL(1),
    CORPORATION(2);

    public final int VALUE;
    private String nameReport;

    TypeClient(int VALUE, String nameReport) {
        this.VALUE = VALUE;
        this.nameReport = nameReport;
    }

    TypeClient(int value){
        this.VALUE = value;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getNameReport() {
        return nameReport;
    }

    public void setNameReport(String nameReport) {
        this.nameReport = nameReport;
    }
}
