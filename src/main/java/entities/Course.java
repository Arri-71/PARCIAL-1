package entities;

public class Course {
        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public int getCredits() {
            return credits;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        private String shortName;
        private int credits;

        public Course(String shortName) {
            this.shortName = shortName;
            this.credits = credits;
        }

    }
