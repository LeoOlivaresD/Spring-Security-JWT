package cl.javadevs.springsecurityjwt.services;

import cl.javadevs.springsecurityjwt.models.SmartPhone;
import cl.javadevs.springsecurityjwt.repositories.ISmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartPhoneService {
    private ISmartPhoneRepository smartPhoneRepo;

    @Autowired
    public SmartPhoneService(ISmartPhoneRepository smartPhoneRepo) {
        this.smartPhoneRepo = smartPhoneRepo;
    }

    //Creamos un celular
    public void crear(SmartPhone smartPhone) {
        smartPhoneRepo.save(smartPhone);
    }

    //Obtenemos toda una lista de celulares
    public List<SmartPhone> readAll() {
        return smartPhoneRepo.findAll();
    }

    //Obtenemos un celular por su id
    public Optional<SmartPhone> readOne(Long id) {
        return smartPhoneRepo.findById(id);
    }

    //Actualizamos un celular
    public void update(SmartPhone smartPhone) {
        smartPhoneRepo.save(smartPhone);
    }

    //Eliminamos un celular
    public void delete(Long id) {
        smartPhoneRepo.deleteById(id);
    }
}
