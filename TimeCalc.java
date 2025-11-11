public class TimeCalc {
    public static void main(String[] args) {
        String fullTime = args[0];
        int hours = Integer.parseInt(fullTime.substring(0,2));
        int minutes = Integer.parseInt(fullTime.substring(3));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        String strH = "" + newHours;
        String strM = "" + newMinutes;
        if (newHours < 10) {
            strH = "0" + newHours;
        }
        if (newMinutes < 10) {
            strM = "0" + newMinutes;
        }
        System.out.println(strH + ":" + strM);
    }
}
