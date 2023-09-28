package com.example.design_pattern.建造者模式.建造者模式扩展.扩展后;

public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;



    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    public static final class PhoneBuilder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        PhoneBuilder() {
        }

        public static PhoneBuilder aPhone() {
            return new PhoneBuilder();
        }

        public PhoneBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PhoneBuilder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public PhoneBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public PhoneBuilder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.mainboard = this.mainboard;
            phone.cpu = this.cpu;
            phone.screen = this.screen;
            phone.memory = this.memory;
            return phone;
        }
    }
}

