package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User u : users) {
            if (u.getUsername().equals(login)) {
                user = u;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("user not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("user status is not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("user name is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println("This user is not valid");
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            System.out.println("This user is not found");
            un.printStackTrace();
        }

    }
}