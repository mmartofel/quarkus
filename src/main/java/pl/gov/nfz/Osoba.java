package pl.gov.nfz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Table(name = "osoba")
@Entity
public class Osoba extends PanacheEntity{

    @Column(length = 30)
    public String imie;
    @Column(length = 50)
    public String nazwisko;
    
}
