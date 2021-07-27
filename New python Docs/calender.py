import calendar
year=int(input("Enter year: "))
print("Is leap year=>",calendar.isleap(year))
print(calendar.weekday(year,5,10))
print(calendar.weekheader(5))
print(calendar.monthrange(year,10))
print(calendar.monthcalendar(year,10))
print(calendar.month(year,2))
print(calendar.calendar(year))