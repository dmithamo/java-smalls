/**
 * Print out the days of the current calendar month
 * Optionally accept a year, month and date as ordered args
 * and print the days of that month
 */

void main(String[] args) {
  int year, month, dayOfMonth;
  LocalDate date;
  Month monthName;

  if (args.length == 3) {
    year = Integer.parseInt(args[0]);
    month = Integer.parseInt(args[1]);
    dayOfMonth = Integer.parseInt(args[2]);

    date = LocalDate.of(year, month, dayOfMonth);
    monthName = date.getMonth();
  } else {
    date = LocalDate.now();
    year = date.getYear();
    month = date.getMonthValue();
    dayOfMonth = date.getDayOfMonth();
    monthName = date.getMonth();
  }

  LocalDate today = LocalDate.now();
  LocalDate firstOfMonth = date.withDayOfMonth(1);
  LocalDate tempDate = firstOfMonth;

  IO.println("\n\n%22s %d\n".formatted(monthName, year));
  IO.println("Mon Tue Wed Thu Fri Sat Sun");

  int countPrinted = 0;

  for (int i = 1; i < firstOfMonth.getDayOfWeek().getValue(); i++) {
    IO.print("%4s".formatted(" "));
    countPrinted += 1;
  }

  // while month is not finished
  while (tempDate.getMonthValue() == month) {
    IO.print("%3d".formatted(tempDate.getDayOfMonth()));
    countPrinted += 1;
    if (tempDate.equals(today)) {
      IO.print("*");
    } else {
      IO.print(" ");
    }
    tempDate = tempDate.plusDays(1);

    if (countPrinted % 7 == 0) {
      IO.println();
    }
  }
  IO.println();
}
