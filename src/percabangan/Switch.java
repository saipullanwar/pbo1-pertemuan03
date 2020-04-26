package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs     : \"Terimakasih pak\"");
                System.out.println("Dosen   : \"Semat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Selamt pagi pak\"");
                System.out.println("Dosen   : \"Pagi juga\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Tugas nya kurang banyak pak\"");
                System.out.println("Dosen   : \"Tugas nya nanti saya kurangin ya\"");
                System.out.println("Mhs     : \"Terimakasih Banyak pakk\"");
                break;
            default:
                System.out.println("Mhs     : \"Pakk Nilai uln semester ini boleh A lah pak??\"");
                System.out.println("Dosen   : \"Iyaa boleh\"");
                System.out.println("Dosen   : \"Semester selanjut nya nanti juga saya kasih A juga\"");
                System.out.println("Dosen   : \"Karna saya orang nya baik dan tidak pemarah\"");
                System.out.println("Mhs     : \"Terimasih Pakkk\"");
                break;

        }

    }
}
