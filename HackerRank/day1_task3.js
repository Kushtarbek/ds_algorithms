/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

  Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
  - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
  input: 07:05:45PM
  output: 19:05:45

 12:40:22AM -> 00:40:22 */

 function timeConversion(s) {
     let [time, period] = s.split(/(?<=[0-9])(AM|PM)/);
     let [hours, minutes, seconds] = time.split(':');

     hours = parseInt(hours);

     if(period === 'PM' && hours !== 12){
         hours += 12;
     } else if(period === 'AM' && hours === 12){
         hours =0;
     }
     return `${hours.toString().padStart(2, '0')}:${minutes}:${seconds}`;

 }
