package Practice;

class User {

    private String name;
    private String email;
    private String phone;
    private String city;

    private User() {}

    public static class UserBuilder {

        private User user;

        public UserBuilder(String name, String email) {
            user = new User();
            user.name = name;
            user.email = email;
        }

        public UserBuilder setPhone(String phone) {
            user.phone = phone;
            return this;
        }

        public UserBuilder setCity(String city) {
            user.city = city;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
