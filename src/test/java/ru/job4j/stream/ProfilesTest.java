package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void test1() {
        Address address1 = new Address("Boston", "57th", 22, 134);
        Address address2 = new Address("Seattle", "Ocean ave", 7, 3);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        List<Profile> profiles = Arrays.asList(profile1, profile2);
        List<Address> expect = Arrays.asList(address1, address2);
        List<Address> result = Profiles.collect(profiles);
        assertThat(result, is(expect));
    }

    @Test
    public void test2() {
        Address address1 = new Address("Seattle", "Ocean ave", 4, 5);
        Address address2 = new Address("Boston", "57th", 22, 134);
        Address address3 = new Address("Seattle", "Ocean ave", 7, 3);
        Address address4 = new Address("Boston", "57th", 22, 134);
        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        Profile profile4 = new Profile(address4);
        List<Profile> profiles = Arrays.asList(profile1, profile2, profile3, profile4);
        List<Address> expect = Arrays.asList(address2, address1, address3);
        List<Address> result = Profiles.collect(profiles);
        assertThat(result, is(expect));
    }
}
