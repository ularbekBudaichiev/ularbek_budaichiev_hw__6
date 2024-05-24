public class Weapon {
    private   WeaponType WeaponType;
    private String Weapons = ("Katana, Rifle, Fire ");

    public Weapon(WeaponType type, String name) {
        this.WeaponType= type;
        this.Weapons = name;
    }





    public WeaponType getWeaponType() {
        return WeaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        WeaponType = weaponType;
    }

    public String getWeapons()
    {
        return Weapons;
    }

    public void setWeapons(String nameWeapons) {
        Weapons = Weapons;
    }
}

