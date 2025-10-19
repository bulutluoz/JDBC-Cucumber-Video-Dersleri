
  Feature: US1005 users tablosu update testleri

    Scenario: TC05 id ile username update islemi yapilabilmeli

      Given kullanici loantech database'e baglanir
      When kullanici "users" tablosunda "id" degeri "13" olan kaydin "username" bilgisini "user1313" yapar
      And "users" tablosunda "id" degeri "13" olan kaydin "username" bilgisinin "user1313" oldugunu test eder
      And database baglantisini kapatir