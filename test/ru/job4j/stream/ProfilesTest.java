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
}
