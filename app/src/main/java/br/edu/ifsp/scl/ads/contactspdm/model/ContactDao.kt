package br.edu.ifsp.scl.ads.contactspdm.model

interface ContactDao {
    fun createContact(contact: Contact): Int
    fun retriveContacts(): MutableList<Contact>
    fun updateContact(contact: Contact): Int
    fun deleteContact(id: Int): Int
}