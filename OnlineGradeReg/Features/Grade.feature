Feature: Grade feature
  Отговяря на действието да се добави оценка на даден ученик.

 
  Scenario: Въвеждане нa оценка от 2 до 6
    Given Потребителят е в системата
    And отваря формата за оценка
    When въвежда оценка от 2 до 6
    Then вижда съобщение с текст "Оценката е правилно въведена!" 
    
    Scenario: Въвеждане на оценка по-голяма от 6
    Given Потребителят е в системата
    And отваря формата за оценка
    When въвежда оценка по-голяма от 6
    Then вижда съобщение с текст "Оценката трябва да е по- малка или равна на 6!" 
    
     Scenario: Въвеждане на оценка по-малка от 2
    Given Потребителят е в системата
    And отваря формата за оценка
    When въвежда оценка по-малка от 2
    Then вижда съобщение с текст "Оценката трябва да е по- голяма или равна на 2!" 

  
