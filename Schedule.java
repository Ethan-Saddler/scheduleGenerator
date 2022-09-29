public class Schedule {
    public static void main(String[] args) {

    }
    public static String[] generateSchedule(String[] subjectList, int numClasses) {
        String[] schedule = new String[numClasses];
        for (int n = 0; i < schedule.length; n++) {
            if (n%2 == 0) {
                schedule[n] = subjectList[(int)(Math.random() * 4)];
            } else {
                schedule[n] = subjectList[(int)(Math.random() * 3 + 4)];
            }
        } 
        return schedule;
    }
    public static int[] computeDifficulties(String[] schedule, String[] subjectList) {
        int[] difficultyList = new int[schedule.length];
        for (int n = 0; n < schedule.length; n++) {
            int i = -1;
            for (int x = 0; x < subjectList.length; x++) {
                if (subjectList[x].equals(schedule[n])) {
                    i = x;
                    break;
                }
            }
            difficultyList[n] = n + i;
        return difficultyList;
        }
    }
    public static void compareDifficulties(String[] schedule1, String[] schedule2, String[] subjectList) {
        int[] difficultyArray1 = computeDifficulties(schedule1, subjectList);
        int[] difficultyArray2 = computeDifficulties(schedule2, subjectList);
        int difficulty1 = 0;
        int difficulty2 = 0;
        int[] difficulties = new int[2]; 
        for (int i = 0; i < difficultyArray1.length; i++) {
            difficulty1 += difficultyArray1[i];
        }   
        for (int i = 0; i < difficultyArray2.length; i++) {
            difficulty2 += difficultyArray2[i];
        }     
        if (difficulty1 > difficulty2) {
            System.out.println("The first schedule is harder than the second schedule.");
        } else if (difficulty1 < difficulty2) {
            System.out.println("The second schedule is harder than the first schedule.");
        } else {
            System.out.println("The two schedules are equally difficult.");
        }

    }


    }
}