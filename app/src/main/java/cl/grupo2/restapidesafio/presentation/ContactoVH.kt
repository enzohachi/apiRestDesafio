package cl.grupo2.restapidesafio.presentation

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import cl.grupo2.restapidesafio.R
import cl.grupo2.restapidesafio.databinding.FragmentListadoContactosBinding
import cl.grupo2.restapidesafio.domain.model.Contacto
import kotlinx.android.synthetic.main.users_list_card.view.*

class ContactoVH (view: View, private val contactoListener: ContactoItemListener?) :
    RecyclerView.ViewHolder(view) {

    private val tvNombre = view.findViewById<TextView>(R.id.tvNombre)
    private val tvEmail = view.findViewById<TextView>(R.id.tvEmail)
    private val tvTelefono = view.findViewById<TextView>(R.id.tvTelefono)
    private val cvContacto = view.findViewById<TextView>(R.id.cvContacto)



    fun bind(contacto: Contacto) {
        tvNombre.text = contacto.name
        tvEmail.text = contacto.email
        tvTelefono.text = contacto.phone
        cvContacto.setOnClickListener { contactoListener?.onContactoItemClick(contacto)}
    }
}