package practice;

import java.util.List;

public class Student {

        private int id;
        private String name;
        private int age;
        private String gender;
        private String course;
        private String city;
        private int height;
        private List<String> phoneNumbers;

        public Student(int id, String name, int age, String gender, String course, String city, int height, List<String> phoneNumbers) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.course = course;
            this.city = city;
            this.height = height;
            this.phoneNumbers = phoneNumbers;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", course='" + course + '\'' +
                ", city='" + city + '\'' +
                ", height=" + height +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}

