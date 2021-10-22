package demo

import grails.rest.Resource

@Resource(uri='/connectionApis')
class ConnectionApi {
    String nombre
    String correo
    Integer semestre
    Integer matricula
    String nivelAcademico
    String nivelAcademicoOpc
    boolean completed

    static constraints = {
    }
}