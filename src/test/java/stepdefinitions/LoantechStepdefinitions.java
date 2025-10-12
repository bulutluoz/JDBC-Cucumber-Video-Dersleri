package stepdefinitions;

import io.cucumber.java.en.*;
import manageQueries.LoantechQueries;
import org.testng.Assert;
import utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoantechStepdefinitions {
    ResultSet resultSet;

    @Given("kullanici loantech database'e baglanir")
    public void kullanici_loantech_database_e_baglanir() {
        ReusableMethods.getMyConnection();
    }

    @When("{string} tablosundaki {string} degerlerini sorgular")
    public void tablosundaki_degerlerini_sorgular(String table, String sutun) {
        // "deposits" tablosundaki "amount" degerlerini sorgular
        // SELECT amount FROM deposits
        String query = LoantechQueries.tablodanSutunSorgusu(table,sutun);
        resultSet = ReusableMethods.executeSelectStatement(query);

    }

    @Then("{int}$ ile {int}$ arasinda {int} amount oldugunu test eder")
    public void $_ile_$_arasinda_amount_oldugunu_test_eder(Integer minTutar, Integer maxTutar, Integer kayitSayisi) throws SQLException {
        // 100$ ile 500$ arasinda 10 amount oldugunu test eder
        // result set bize bir tablo getirir
        // bizden istenen gorev her satirdaki amount miktarini kontrol edip
        // istenen aralikta olanlari saymamiz

        int sayac =0;

        while (resultSet.next()){
            int satirdakiAmountTutari = resultSet.getInt("amount");
            if (satirdakiAmountTutari>=minTutar & satirdakiAmountTutari<=maxTutar){
                sayac++;
            }

        }

        Assert.assertEquals(sayac,kayitSayisi);


    }

    @Then("database baglantisini kapatir")
    public void database_baglantisini_kapatir() {
        ReusableMethods.closeMyConnection();
    }

}
