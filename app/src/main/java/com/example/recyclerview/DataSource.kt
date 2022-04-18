package com.example.recyclerview

import com.example.recyclerview.models.Video

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<Video> {
            val list = ArrayList<Video>()

            list.add(
                Video(
                    "Todos os Pokemons (890)",
                    "Quick Drawing",
                    "https://i.ytimg.com/vi/YyEdWXTj6AI/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLChvnrsbkcWgoM5Fw2iD8hMN7r9pg",
                    "https://www.youtube.com/watch?v=YyEdWXTj6AI&ab_channel=QuickDrawing"
                )
            )

            list.add(
                Video(
                    "All 898 Pokémon",
                    "Tom Salazar",
                    "https://i.ytimg.com/vi/e8IGjXW1xDw/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDFQERo04LdGQ-gjIxeR2j4xPs2NA",
                    "https://www.youtube.com/watch?v=e8IGjXW1xDw&ab_channel=TomSalazar"
                )
            )

            list.add(
                Video(
                    "TOP 5 OS MELHORES JOGOS DE POKÉMON GBA E CELULAR DE 2021",
                    "Breno Menezes",
                    "https://i.ytimg.com/vi/v0WPR_0ceGU/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBhxoTwpar5PXIUNVK9WvRE79FLZg",
                    "https://www.youtube.com/watch?v=v0WPR_0ceGU"
                )
            )

            list.add(
                Video(
                    "Os 14 Melhores Jogos de Pokémon para o My Boy! / Emulador de GBA para Android",
                    "Eduardo Bardeja Filho",
                    "https://i.ytimg.com/vi/OWfW-568ooU/hqdefault.jpg?sqp=-oaymwEcCOADEI4CSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDISd_EClMA-_arpejGu1gYH2OcTQ",
                    "https://www.youtube.com/watch?v=OWfW-568ooU&ab_channel=EduardoBardejaFilho"
                )
            )
            list.add(
                Video(
                    "Os melhores momentos de Ash | Pokémon | Cartoon Network",
                    "Cartoon Network Brasil",
                    "https://i.ytimg.com/vi/AkAx1pjq9kQ/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLC9doGbeJfI0jR672x_o98RBsXiGw",
                    "https://www.youtube.com/watch?v=AkAx1pjq9kQ&ab_channel=CartoonNetworkBrasil"
                )
            )
            return list
        }
    }
}