public class HelloWorld {
    public static void main(String[] args) {
//        int obj1 = 0;
//        String[] greetings = {
//                "Hello world", "No, obj1 mean it", "HELLO WORLD"
//        };
//        while (obj1 < 4) {
//            try {
//                System.out.println(greetings[obj1]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("reset index value");
//                obj1 = -1;
//            } catch (Exception e) {
//                System.out.println(e);
//            } finally {
//                System.out.println("This is always printed");
//            }
//            obj1++;
//        }

        Person person = new Person();
        person.setPhoneNumber("110");
        System.out.println(person.phoneNumber);

    }

    static class Person {
        private String name;
        private int age;
        private String sex, phoneNumber;

        public Person() {

        }


        private String getName() {
            return "";
        }

        private int getAge() {
            return -1;
        }

        private void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

    }
}
