
  Feature:US1008 Subscribers tablosuna kayit ekleme
    @wip
    Scenario:

      Given kullanici loantech database'e baglanir
      When kullanici subscribers tablosunda id degeri "29" ve email bilgisi "jdbcBitti@jdbc.com" olan bir kayit ekler
      And "subscribers" tablosunda "id" degeri "29" olan kaydin "email" bilgisinin "jdbcBitti@jdbc.com" oldugunu test eder
      And database baglantisini kapatir