package compack1;

class Example20 {
    public static void main(String[] args) {
        int day = 1;          
        int time = 5;         

        if (day == 1) {       
            if (time < 6) {
                System.out.println("Sleep");
            } else {
                System.out.println("Relax at home");
            }
        } else {              // Weekdays
            switch (time) {
                case 6:
                    System.out.println("Wake up");
                    break;
                case 7:
                    System.out.println("Get ready for college");
                    break;
                case 8:
                    System.out.println("Drop sibling at school");
                    break;
                case 9:
                    System.out.println("Go to college");
                    break;
                default:
                    while (time <= 16) {
                        do {
                            System.out.println("Listen to class lecture");

                            for (int t = 10; t <= 16; t++) {
                                if (t == 13) {
                                    System.out.println("Have lunch");
                                } else if (t > 16) {
                                    System.out.println("Time to go home");
                                }
                            }
                        } while (time < 16);

                        time++;    
                    }
            }
        }
    }
}