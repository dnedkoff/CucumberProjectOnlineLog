Feature: Student feature
  Добавя се добавя нов ученик

  
  Scenario: Добавяне на ученик с пълни данни
    Given Потребителят влиза в системата
    And отваря формата за данни на ученик
    When въвежда данните на ученика
    And натиска бутона въведи 
    Then вижда информация "Данните са въведени!" 



Scenario: Добавяне на ученик с непълни данни
    Given Потребителят влиза в системата
    And отваря формата за данни на ученик
    When въвежда данните на ученика без фамилия
    And натиска бутона въведи
    Then вижда информация "Данните са непълни!" 
