package com.Proyecto_Laboratorio.Laboratorio.Controlador;


import com.Proyecto_Laboratorio.Laboratorio.Dao.SolicitudDaoImp;
import com.Proyecto_Laboratorio.Laboratorio.Modelos.Solicitud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import javax.validation.Valid;
import java.util.List;

@Controller
public class ConsultaSolicitudControlador {

    @Autowired
    private SolicitudDaoImp solicitudDaoImp;

    @GetMapping("ConsultaSolicitudes")
    public String  getCrearSolicitud( Model model)
    {
        List<Solicitud> lstSolicitudes =solicitudDaoImp.getsolicitudes();
       model.addAttribute("lstSolicitudes", lstSolicitudes);
        model.addAttribute("Titulo", "Lista de Solicitudes");
        return "ConsultaSolicitudes";
    }

    @GetMapping("CrearSolicitud")
    public String  crearEmpleado( Model model)
    {
       // Empleado e = new Empleado();
       // model.addAttribute("Empleado", e);
        model.addAttribute("Titulo", "Crear Nueva Solicitud");
        return "CrearSolicitud";
    }

    @PostMapping("/guardar")
    public String  guardarSolicitud( Model model)
    {
        //EdaoImp.guardarEmpleado(e);
        return "redirect:/ConsultaSolicitudes";
    }
}
