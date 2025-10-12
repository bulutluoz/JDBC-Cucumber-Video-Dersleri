
  Feature: US1003 subscribers tablosu email sorgusu

    Scenario: TC03 istenen turden email sayisi testi

      Given kullanici loantech database'e baglanir
      When "subscribers" tablosundaki "email" degerlerini sorgular
      Then email bilgisi "@hotmail.com" olan kisi sayisinin 3 den fazla oldugunu test eder
      And database baglantisini kapatir