package net.projecttl.plugin.example.utility

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

@Suppress("deprecation")
class HibernateUtil private constructor() {
    private val sessionFactory: SessionFactory

    init {
        val configuration = Configuration()
        configuration.configure("hibernate.cfg.xml")
        sessionFactory = configuration.buildSessionFactory()
    }

    companion object {
        val instance = HibernateUtil()
        val session: Session
            get() = instance.sessionFactory.openSession()
    }
}