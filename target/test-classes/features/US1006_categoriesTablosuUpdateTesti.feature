
  Feature: US1006 Categories tablosunda istenen degeri update etme

    Scenario: TC06 Kullanici categories tablosunda istenen update islemini yapabilmeli
      
      Given kullanici loantech database'e baglanir
      When kullanici "categories" tablosunda "name" degeri "Basic Loan" olan kaydin "description" bilgisini "entry level" yapar
      Then "categories" tablosunda "name" degeri "basic loan" olan kaydin "description" bilgisinin "entry level" oldugunu test eder
      And database baglantisini kapatir