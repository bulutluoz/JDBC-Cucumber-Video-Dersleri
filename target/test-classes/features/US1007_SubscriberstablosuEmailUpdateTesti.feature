
  Feature: US1007 subscribers tablosunda istenen degeri update etme

    Scenario: TC07 id ile email update islemi yapilabilmeli

      Given kullanici loantech database'e baglanir
      When kullanici "subscribers" tablosunda "id" degeri "13" olan kaydin "email" bilgisini "jdbcNeGuzel@jdbc.com" yapar
      And "subscribers" tablosunda "id" degeri "13" olan kaydin "email" bilgisinin "jdbcNeGuzel@jdbc.com" oldugunu test eder
      And database baglantisini kapatir
