public class Main {
    public static void main(String[] args) {

            Boss boss = new Boss();
            boss.setHealth(400);
            boss.setDamage(50);
            Weapon FireArms = new Weapon(WeaponType.MagicalWeapon, "Fire: ");
            FireArms.setWeaponType(WeaponType.SteelArms);
            FireArms.setWeapons("Rifle: ");
            boss.setWeapon(FireArms);
            boss.printInfo();



            Weapon skeletonWeapon1 = new Weapon(WeaponType.FireArms,"Rifle: ");
            Skeleton skeleton1 = new Skeleton();
            skeleton1.setHealth(560);
            skeleton1.setDamage(34);
            skeleton1.setWeapon(skeletonWeapon1);
            skeleton1.setNumberOfRounnd(10);
            skeleton1.printInfo();

            Weapon skeletonWeapon2 = new Weapon(WeaponType.SteelArms," Katana: ");
            Skeleton skeleton2 = new Skeleton();
            skeleton2.setHealth(80);
            skeleton2.setDamage(26);
            skeleton2.setWeapon(skeletonWeapon2);
            skeleton2.setNumberOfRounnd(7);
            skeleton2.printInfo();

        }
    }
