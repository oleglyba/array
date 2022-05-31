package com.company;
    public class One {
        double salary;
        int numberEmployees;

        public One(double salary, int numberEmployees) {
            this.salary = salary;
            this.numberEmployees = numberEmployees;
        }

        int push() {
            int array[] = new int[1];
            for (int i = 0; i < array.length; i++) {
                array[i] = 1 + (int) (Math.random() * 4);


            }
            return array[0];
        }

        void entrance() {
            OneDemo toysDemo = new OneDemo();
            toysDemo.lucky();
        }

        public class OneDemo {
            String s1 = "Олег";
            String s2 = "Віка";
            String s3 = "Андріян";
            String s4 = "Коля";

            void lucky() {
                if (numberEmployees == 4) {
                    if (push() == 1) {
                        System.out.println("Lucky this month " + s1 + ", happy money for the amount " + (0.03 * salary) + "UAH");
                    } else if (push() == 2) {
                        System.out.println("Lucky this month " + s2 + ", happy money for the amount " + (0.03 * salary) + " UAH");
                    } else if (push() == 3) {
                        System.out.println("Lucky this month " + s3 + ", happy money for the amount " + (0.03 * salary) + " UAH");
                    } else {
                        System.out.println("Lucky this month " + s4 + ", happy money for the amount " + (0.03 * salary) + " UAH");
                    }

                } else {
                    System.out.println("There will be no Happy Money");
                }
            }
        }


        }



