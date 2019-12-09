package proxy.protection;

import java.lang.reflect.Proxy;

public class MatchMakingTest {
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person)
        );
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NotOwnerInvocationHandler(person)
        );
    }

    public static void main(String[] args) {
        MatchMakingTest test = new MatchMakingTest();
        test.drive();
    }

    public void drive() {
        PersonBean joe = new PersonBeanImpl("joe");
        PersonBean ownerProxy = getOwnerProxy(joe);

        System.out.println("name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, basketball");
        System.out.println("interests set from owner proxy");

        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("can't set rating from owner proxy");
        }
        System.out.println("rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("football, skating");
        } catch (Exception e) {
            System.out.println("can't set interests from non owner proxy");
        }

        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("rating set from non owner proxy");
        System.out.println("rating is " + nonOwnerProxy.getHotOrNotRating());

    }
}
