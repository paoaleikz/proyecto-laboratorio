package com.Proyecto_Laboratorio.Laboratorio.Controlador;


import com.Proyecto_Laboratorio.Laboratorio.Dao.*;
import com.Proyecto_Laboratorio.Laboratorio.Modelos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ConsultaSolicitudControlador {

    @Autowired
    private SolicitudDaoImp solicitudDaoImp;
    @Autowired
    private TipoSolicitudDaoImp tSolicitudImp;
    @Autowired
    private TipoSoporteDaoImp tSoporteImp;
    @Autowired
    private TipoSolicitanteDaoImp tSolicitanteImp;
    @Autowired
    private ExpedienteDaoImp ExpedienteImp;

    @GetMapping("ConsultaSolicitudes")
    public String  getSolicitudes( Model model)
    {
        List<Solicitud> lstSolicitudes =solicitudDaoImp.getsolicitudes();
       model.addAttribute("lstSolicitudes", lstSolicitudes);
        model.addAttribute("Titulo", "Lista de Solicitudes");
        return "ConsultaSolicitudes";
    }

    @GetMapping("CrearSolicitud")
    public String  crearSolicitud( Model model)
    {
        Solicitud e = new Solicitud();
        e.setNoSolicitud(0);
        model.addAttribute("Solicitud", e);
        List<TipoSolicitud> lstTipoSolicitudes =tSolicitudImp.gettipoSolicitantes();
        model.addAttribute("lstTipoSolicitudes", lstTipoSolicitudes);
        List<TipoSolicitante> lstTipoSolicitantes =tSolicitanteImp.getSolicitantes();
        model.addAttribute("lstTipoSolicitantes", lstTipoSolicitantes);
         List<TipoSoporte> lstTipoSoporte =tSoporteImp.getTipoSoportes();
         model.addAttribute("lstTipoSoporte", lstTipoSoporte);
        model.addAttribute("Titulo", "Crear Nueva Solicitud");
        return "CrearSolicitud";
    }

    @PostMapping("/guardar")
    public String  guardarSolicitud( @Valid Solicitud e, Model model)
    {
        solicitudDaoImp.CrearSolicitud(e);

        return "redirect:/ConsultaSolicitudes";
    }

    @PostMapping("/buscar/{expediente}")
    public String  buscarExpediente(@PathVariable String expediente, Model model)
    {

       // Solicitud e = new Solicitud();
        //model.addAttribute("Solicitud", e);
        List<TipoSolicitud> lstTipoSolicitudes =tSolicitudImp.gettipoSolicitantes();
        model.addAttribute("lstTipoSolicitudes", lstTipoSolicitudes);
        List<TipoSolicitante> lstTipoSolicitantes =tSolicitanteImp.getSolicitantes();
        model.addAttribute("lstTipoSolicitantes", lstTipoSolicitantes);
        // List<TipoSoporte> lstTipoSoporte =tSoporteImp.getTipoSoportes();
        // model.addAttribute("lstTipoSoporte", lstTipoSoporte);
        model.addAttribute("Titulo", "Crear Nueva Solicitud");
        return "redirect:/CrearSolicitud";
    }
}
