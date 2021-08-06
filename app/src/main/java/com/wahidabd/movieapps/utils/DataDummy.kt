package com.wahidabd.movieapps.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.wahidabd.movieapps.models.DataMovie

object DataDummy {

    fun getAllMovie(): LiveData<List<DataMovie>>{
        val data = MutableLiveData<List<DataMovie>>()

        data.postValue(
            listOf(
                DataMovie(
                    1,
                    "Jungle Cruise",
                    "Dr. Lily Houghton enlists the aid of wisecracking skipper Frank Wolff to take her down the Amazon in his dilapidated boat. Together, they search for an ancient tree that holds the power to heal – a discovery that will change the future of medicine.",
                    "/9dKCd55IuTT5QRs989m9Qlb7d2B.jpg",
                    "/7WJjFviFBffEJvkAms4uWwbcVUk.jpg",
                    "2021-07-28"
                ),

                DataMovie(
                    2,
                    "F9",
                    "Dominic Toretto and his crew battle the most skilled assassin and high-performance driver they've ever encountered: his forsaken brother.",
                    "/bOFaAXmWWXC3Rbv4u4uM9ZSzRXP.jpg",
                    "/gGTCDNEvwG848u34Op1nZNALLUr.jpg",
                    "2021-05-19"
                ),

                DataMovie(
                    3,
                    "Black Widow",
                    "Natasha Romanoff, also known as Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. Pursued by a force that will stop at nothing to bring her down, Natasha must deal with her history as a spy and the broken relationships left in her wake long before she became an Avenger.",
                    "/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg",
                    "/dq18nCTTLpy9PmtzZI6Y2yAgdw5.jpg",
                    "2021-07-07"
                ),

                DataMovie(
                    4,
                    "Space Jam: A New Legacy",
                    "When LeBron and his young son Dom are trapped in a digital space by a rogue A.I., LeBron must get them home safe by leading Bugs, Lola Bunny and the whole gang of notoriously undisciplined Looney Tunes to victory over the A.I.'s digitized champions on the court. It's Tunes versus Goons in the highest-stakes challenge of his life.",
                    "/5bFK5d3mVTAvBCXi5NPWH0tYjKl.jpg",
                    "/8s4h9friP6Ci3adRGahHARVd76E.jpg",
                    "2021-07-08"
                ),

                DataMovie(
                    5,
                    "The Boss Baby: Family Business",
                    "The Templeton brothers — Tim and his Boss Baby little bro Ted — have become adults and drifted away from each other. But a new boss baby with a cutting-edge approach and a can-do attitude is about to bring them together again … and inspire a new family business.",
                    "/5dExO5G2iaaTxYnLIFKLWofDzyI.jpg",
                    "/gX5UrH1TLVVBwI7WxplW43BD6Z1.jpg",
                    "2021-07-01",
                ),

                DataMovie(
                    6,
                    "The Forever Purge",
                    "All the rules are broken as a sect of lawless marauders decides that the annual Purge does not stop at daybreak and instead should never end as they chase a group of immigrants who they want to punish because of their harsh historical past.",
                    "/uHA5COgDzcxjpYSHHulrKVl6ByL.jpg",
                    "/tehpKMsls621GT9WUQie2Ft6LmP.jpg",
                    "2021-06-30"
                ),

                DataMovie(
                    7,
                    "Luca",
                    "Luca and his best friend Alberto experience an unforgettable summer on the Italian Riviera. But all the fun is threatened by a deeply-held secret: they are sea monsters from another world just below the water’s surface.",
                    "/jTswp6KyDYKtvC52GbHagrZbGvD.jpg",
                    "/620hnMVLu6RSZW6a5rwO8gqpt0t.jpg",
                    "2021-06-17"
                ),

                DataMovie(
                    8,
                    "Jolt",
                    "Lindy is an acid-tongued woman with rage issues who controls her temper by shocking herself with an electrode vest. One day she makes a connection with Justin, who gives her a glimmer of hope for a shock-free future, but when he’s murdered she launches herself on a revenge-fueled rampage in pursuit of his killer.",
                    "/gYZAHan5CHPFXORpQMvOjCTug4E.jpg",
                    "/wPjtacig0kIkVcTQmXoNt6jbMwo.jpg",
                    "2021-07-15"
                ),

                DataMovie(
                    9,
                    "The Tomorrow War",
                    "The world is stunned when a group of time travelers arrive from the year 2051 to deliver an urgent message: Thirty years in the future, mankind is losing a global war against a deadly alien species. The only hope for survival is for soldiers and civilians from the present to be transported to the future and join the fight. Among those recruited is high school teacher and family man Dan Forester. Determined to save the world for his young daughter, Dan teams up with a brilliant scientist and his estranged father in a desperate quest to rewrite the fate of the planet.",
                    "/34nDCQZwaEvsy4CFO5hkGRFDCVU.jpg",
                    "/yizL4cEKsVvl17Wc1mGEIrQtM2F.jpg",
                    "2021-06-30"
                ),

                DataMovie(
                    10,
                    "Infinite",
                    "Evan McCauley has skills he never learned and memories of places he has never visited. Self-medicated and on the brink of a mental breakdown, a secret group that call themselves “Infinites” come to his rescue, revealing that his memories are real.",
                    "/niw2AKHz6XmwiRMLWaoyAOAti0G.jpg",
                    "/wjQXZTlFM3PVEUmKf1sUajjygqT.jpg",
                    "2021-06-10"
                ),

                DataMovie(
                    11,
                    "Blood Red Sky",
                    "A woman with a mysterious illness is forced into action when a group of terrorists attempt to hijack a transatlantic overnight flight. In order to protect her son she will have to reveal a dark secret, and unleash the inner monster she has fought to hide.",
                    "/ky8Fua6PD7FyyOA7JACh3GDETli.jpg",
                    "/s15olg5LwRqTjgDd5KIfVXhcoqs.jpg",
                    "2021-07-23"
                ),

                DataMovie(
                    12,
                    "The Exorcism of Carmen Farias",
                    "Carmen, a brave journalist, discovers soon after her mother's death that she has inherited her grandma's house. She decides to move there without knowing it hides dark secrets.",
                    "/uoTPjx07dxTrC1g3dYeaS2WNVGL.jpg",
                    "/zm2kMjiz0u6qdn2XKbEbQkDiltN.jpg",
                    "2021-07-05"
                ),

                DataMovie(
                    13,
                    "The Suicide Squad",
                    "Supervillains Harley Quinn, Bloodsport, Peacemaker and a collection of nutty cons at Belle Reve prison join the super-secret, super-shady Task Force X as they are dropped off at the remote, enemy-infused island of Corto Maltese.",
                    "/7RMPmoePWo4zYpAiEsqOap42jXn.jpg",
                    "/rAgsOIhqRS6tUthmHoqnqh9PIAE.jpg",
                    "2021-07-28"
                ),

                DataMovie(
                    14,
                    "Dynasty Warriors",
                    "Warlords, warriors and statesmen wage a battle for supremacy in this fantasy tale based on the hit video games and the \\\"Romance of the Three Kingdoms.\\\"",
                    "/7BCTdek5LFHglcgl7shsm7igJAH.jpg",
                    "/iJ2HVOZT9Kjayrhy21pbGIJs9ey.jpg",
                    "2021-04-29"
                ),

                DataMovie(
                    15,
                    "Peter Rabbit 2: The Runaway",
                    "Bea, Thomas, and the rabbits have created a makeshift family, but despite his best efforts, Peter can’t seem to shake his mischievous reputation. Adventuring out of the garden, Peter finds himself in a world where his mischief is appreciated, but when his family risks everything to come looking for him, Peter must figure out what kind of bunny he wants to be.",
                    "/cycDz68DtTjJrDJ1fV8EBq2Xdpb.jpg",
                    "/5HjzYTihkH7EvOWSE7KcsF6pBMM.jpg",
                    "2021-03-25"
                ),

                DataMovie(
                    16,
                    "Trollhunters: Rise of the Titans",
                    "Arcadia may look like an ordinary town, but it lies at the center of magical and mystical lines that makes it a nexus for many battles among otherworldly creatures, including trolls, aliens, and wizards. Now, various heroes will team-up in an epic adventure where they must fight the Arcane Order for control over the magic that binds them all together.",
                    "/zvUNFeTz0Sssb210wSiIiHRjA4W.jpg",
                    "/3OwaKVZf3A2NdnarqKbwzFEhKir.jpg",
                    "2021-07-21"
                )
            )
        )

        return data
    }
}