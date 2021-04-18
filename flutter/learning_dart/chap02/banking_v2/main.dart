import 'dart:core';

class Person {
  // Person propertied and methods
  String? name, address;
  // ...
}

/**
 * A bank account has an [owner], is identified by a [number]
 * ans has an amount of money called [balance].
 * The balance is changed through methods [deposit] and [withdraw].
 */
class BankAccount {
  String owner, number;
  // Person owner;
  double balance;
  DateTime? dateCreated, dateModified;

  /* constructor
  BankAccount(this.owner, this.number, this.balance) {
    dateCreate = new DateTime.new();
  } */
  // version with initializer list
  BankAccount(this.owner, this.number, this.balance)
      : dateCreated = new DateTime.now();

  // methods
  /// An amount of money is added to the balance.
  deposit(double amount) {
    balance += amount;
    dateModified = new DateTime.now();
  }

  /// An amount of money is subtracted from the balance.
  withdraw(double amount) {
    balance -= amount;
    dateModified = new DateTime.now();
  }

  String toString() =>
      'Bank account from $owner with number $number and balance $balance';
}

void main() {
  var ba = new BankAccount("John Gates", "075-0623456-72", 1000.0);
  assert(ba is BankAccount);
  print('$ba');

  // without toString(): Instance of 'BankAccount'
  // with toString(): Bank account from John Gates with number 075-0623456-72 and balance 1000.0
  print('Bank account created at: ${ba.dateCreated}');
  ba.withdraw(100.0);
  print('Balance after withdrawal:\t ${ba.balance} \$'); // 900.0
  print('Account balance modified at: ${ba.dateModified}');
  print('${ba.dateModified?.weekday}');

  // cascading notation
  ba
    ..balance = 5000.0 // no ;
    ..withdraw(100.0)
    ..deposit(250.0); // only the last statement has a ;

  print('Balance:\t ${ba.balance} \$'); // 5150.0
}
