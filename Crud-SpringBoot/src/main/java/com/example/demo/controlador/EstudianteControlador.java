package com.example.demo.controlador;

import com.example.demo.entidad.Estudiante;
import com.example.demo.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio servicio;

    @GetMapping("/estudiantes")
    public String listarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
        return "estudiantes"; //Retorna archivo estudiantes

    }

    @GetMapping("/estudiantes/nuevo") //Metodo crear estudiante
    public String CrearEstudianteFormulario(Model modelo) {
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante", estudiante);
        return "crear_estudiantes";

    }

    @PostMapping("/estudiantes")//Metodo Guardar estudiante
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        servicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}") //Trae el formulario para editar
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("estudiante", servicio.obtenerEstudiantePorId(id));
        return "editar_estudiantes";
    }

    @PostMapping("/estudiantes/{id}") //Metodo editar estudiante
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo) {
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());
        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}") //Metodo eliminar estudiante
    public String eliminarEstudiante(@PathVariable Long id) {
        servicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }

}
