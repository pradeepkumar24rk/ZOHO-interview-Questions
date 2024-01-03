public class Calendar {

        public static boolean Leap(int n) {
                if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
                        return true;
                return false;
        }

        public static int tempDate(int month, int year) {
                if (month == 4 || month == 6 || month == 8 || month == 10 || month == 12)
                        return month;
                else if (month == 1)
                        return Leap(year) ? 4 : 3;
                else if (month == 3)
                        return 7;
                else if (month == 9 || month == 5)
                        return month == 9 ? 5 : 9;
                else if (month == 11 || month == 7)
                        return month == 7 ? 11 : 7;
                return 0;
        }

        public static int yearOldDays(int year) {
                int tensYear = year % 100;
                year -= tensYear;
                int sum = 0;
                int yearOldays[] = { 5, 3, 1, 0 };
                year = (year % 400) / 100;
                // System.out.println(year);
                if(year!=0)
                        sum += yearOldays[year - 1];
                // System.out.println(sum);
                int leapYearInTensYear = (int) tensYear / 4;
                int nonleapYearInTensYear = tensYear - leapYearInTensYear;
                // System.out.println(((leapYearInTensYear * 2) + nonleapYearInTensYear)%7);
                sum += ((leapYearInTensYear * 2) + nonleapYearInTensYear) % 7;
                // System.out.println(sum);
                return sum;

        }

        public static int findFebLastDay(int year) {
                int sum = Leap(year) ? 4 : 3;
                // System.out.println(sum+yearOldDays(year-1));
                return sum + yearOldDays(year-1);
        }

        public static void main(String[] args) {
                String day[] = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
                int date = 24, month = 04, year = 2002;
                int febLastDay = findFebLastDay(year);
                int tempDate = tempDate(month, year), tempDay = febLastDay;
                if (tempDate == date)
                        System.out.println(day[tempDay]);
                else {
                        int dayDifference = date - tempDate;
                        if(date>tempDate) {
                                tempDay  = (tempDay+dayDifference) % 7;
                        } else {
                                tempDay = tempDay+dayDifference;
                                if(tempDay<0) {
                                        tempDay+=7;
                                }
                        }
                        // System.out.println(tempDay);
                        System.out.println(day[tempDay]);
                }
        }
}

/*
 * 
 * Explaination:
 * 
 * 0 - sunday
 * 1 - monday
 * 2 - tuesday
 * 3 - wednesday
 * 4 - thursday
 * 5 - friday
 * 7 - saturday
 * 
 * ODD DAYS:
 * No. of days cannot form a week is called odd days
 * To find odd days = ndays%7
 * 
 * 365 days -> 52 weeks + 1 day (Here 1 day is a odd day)
 * 366 days -> 52 weeks + 2 days (Here 2 days is a odd day)
 * 
 * 
 * years no.of odd days
 * 100 - 5 days
 * 200 - 3 days
 * 300 - 1 days
 * 400 - 0 days
 * 
 * Feb last day = (date/month) ==> 4/4, 6/6, 8/8,10/10,12/12,
 * 9/5,5/9,11/7,7/11,
 * 7/3
 * jan - 3(nonleap) and 4(leap)
 * 
 * eg: if feb 28 - friday
 * april 4 - friday
 * june 6 - friday
 * 
 * Example: 15/08/1947
 * Step 1: find the refrence date
 * 1947%4 - not leap year
 * 
 * 28/02/1947 --- this is the refrence date
 * 28%7 = 0 odd days
 * month 1 has 31 days(31%7) = 3 odd days
 * 
 * Step 2: Find the no. of odd days in Previous year
 * 1946 -> (1900+46)
 * 1900 - 400+400+400+400+300 (find odd day for the year which are splited)
 * 0 + 0 + 0 + 0 + 1 = 1 odd day
 * 
 * 46/4 = 11 leapYear
 * (46-11) = 35 non leap year
 * 
 * 11 leap year has (11*2) = 22 odd days
 * 35 non leap year has (35*1) = 35 odd days
 * ---------------
 * = 57 odd days
 * ---------------
 * 
 * 57%7 = 1 odd day
 * 
 * Step 3: Add all the odd days
 * 
 * 0 + 3 + 1 + 1 = 5 ------> friday
 * 
 * Hence the Refrence date 28/02/1947 - friday
 * 08/08/1947 - friday
 * 
 * 08+07(1 week) = 15
 * 
 * 15/08/1947 - friday
 * 
 */