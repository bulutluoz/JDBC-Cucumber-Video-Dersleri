package manageQueries;

public class LoantechQueries {

    public static String tablodanSutunSorgusu(String tablo , String sorgulanacakSutun){
        return "SELECT "+ sorgulanacakSutun + " FROM " + tablo;
    }

    public static String tumTabloSorgusu(String tabloAdi){
        return "SELECT * FROM " + tabloAdi;
    }

    public static String istenenDegeriUpdateSorgusu(String table, String degisecekBilgi,
                                                    String degisecekDeger, String filtreSutunu,
                                                    String filtreDegeri){
        return "UPDATE " + table + " SET " + degisecekBilgi + "='" + degisecekDeger +
                "' WHERE " + filtreSutunu + "='" + filtreDegeri + "';";
    }

    public static String istenenDegeriSorgulama(String istenenBilgi, String table,
                                                String filtreBilgi,String filtreDeger){
        return "SELECT " + istenenBilgi + " FROM " + table+
                " WHERE " + filtreBilgi + "= '"+ filtreDeger + "';";
    }
}
