package demo

import spock.lang.Specification
import grails.testing.gorm.DomainUnitTest

class ConnectionApiSpec extends Specification implements DomainUnitTest<ConnectionApi> {

    void "El nombre es requerido"() {
        when:
        def ConnectionApi = new ConnectionApi(nombre: nombre)

        then:
        !ConnectionApi.validate()
        ConnectionApi.errors['nombre'].code == errorCode

        where:
        nombre | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }

    void "El correo es requerido"() {
        when:
        def ConnectionApi = new ConnectionApi(correo: correo)

        then:
        !ConnectionApi.validate()
        ConnectionApi.errors['correo'].code == errorCode

        where:
        correo | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }

    void "El semestre es requerido"() {
        when:
        def ConnectionApi = new ConnectionApi(semestre: semestre)

        then:
        !ConnectionApi.validate()
        ConnectionApi.errors['semestre'].code == errorCode

        where:
        semestre | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }

    void "La matricula es requerida"() {
        when:
        def ConnectionApi = new ConnectionApi(matricula: matricula)

        then:
        !ConnectionApi.validate()
        ConnectionApi.errors['matricula'].code == errorCode

        where:
        matricula | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }

    void "El nivel Academico es requerido"() {
        when:
        def ConnectionApi = new ConnectionApi(nivelAcademico: nivelAcademico)

        then:
        !ConnectionApi.validate()
        ConnectionApi.errors['nivelAcademico'].code == errorCode

        where:
        nivelAcademico | errorCode
        null | 'nullable'
        ''   | 'nullable'
    }
}