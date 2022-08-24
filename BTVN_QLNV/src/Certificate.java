public class Certificate {
    protected String id, name, rank,date;

    public Certificate(){

    }

     public Certificate(String id, String name, String rank, String date) {
          this.id = id;
          this.name = name;
          this.rank = rank;
          this.date = date;
     }

     public String getCertificatedID() {
          return id;
     }

     public void setCertificatedID(String certificatedID) {
          this.id = id;
     }

     public String getCertificateName() {
          return name;
     }

     public void setCertificateName(String name) {
          this.name = name;
     }

     public String getCertificateRank() {
          return rank;
     }

     public void setCertificateRank(String certificateRank) {
          this.rank = rank;
     }

     public String getCertificatedDate() {
          return date;
     }

     public void setCertificatedDate(String certificatedDate) {
          this.date = date;
     }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificatedID='" + id + '\'' +
                ", certificateName='" + name + '\'' +
                ", certificateRank='" +rank + '\'' +
                ", certificatedDate='" + date + '\'' +
                '}';
    }
}
