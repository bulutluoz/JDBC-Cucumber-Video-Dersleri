
  Feature: US1004 Saucedemo username testi

    Scenario: TC04 id'si verilen kaydin username bilgisi beklenen deger olmalidir

      Given kullanici loantech database'e baglanir
      When "saucedemo" tablosundaki tum sutunlari sorgular
      Then id degeri 1005 olan kaydin username bilgisinin "error_user" oldugunu test eder
      And database baglantisini kapatir