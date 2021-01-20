package com.dizcoding.projectjpr

import com.dizcoding.projectjpr.data.source.local.entity.FilmDetailEntity
import com.dizcoding.projectjpr.data.source.local.entity.MovieEntity
import com.dizcoding.projectjpr.data.source.local.entity.TvEntity
import com.dizcoding.projectjpr.data.source.remote.response.MovieResponse
import com.dizcoding.projectjpr.data.source.remote.response.TvResponse
import com.dizcoding.projectjpr.ui.adapter.movies.MovieModel
import com.dizcoding.projectjpr.ui.adapter.tvshow.TvShowModel

class IConfig {
    companion object {
        const val IMDB_API_KEY = "0339a3a525cc3205e63768f56549664e"
        const val IMDB_BASE_API_URL = "https://api.themoviedb.org/3/"
        const val IMDB_IMAGE_URL = "https://image.tmdb.org/t/p/original"

        fun generateDataMovie(): ArrayList<MovieModel> {
            val datas = arrayListOf<MovieModel>()

            datas.add(
                MovieModel(
                    464052,
                    "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                    "Wonder Woman 1984",
                    "Wonder Woman comes into conflict with the Soviet Union during the Cold War in the 1980s and finds a formidable foe by the name of the Cheetah.",
                    "/srYya1ZlI97Au4jUYAktDe3avyA.jpg",
                    "en",
                    "2020-12-16",
                    7.2
                )
            )
            datas.add(
                MovieModel(
                    508442,
                    "/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg",
                    "Soul",
                    "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half Note Club, he suddenly gets into an accident that separates his soul from his body and is transported to the You Seminar, a center in which souls develop and gain passions before being transported to a newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons in the You Seminar, in order to get back to Earth.",
                    "/kf456ZqeC45XTvo6W9pW5clYKfQ.jpg",
                    "en",
                    "2020-12-25",
                    8.3
                )
            )
            datas.add(
                MovieModel(
                    675327,
                    "/t7EUMSlfUN3jUSZUJOLURAzJzZs.jpg",
                    "Shadow in the Cloud",
                    "A WWII pilot traveling with top secret documents on a B-17 Flying Fortress encounters an evil presence on board the flight.",
                    "/aHYUj0hICtWZ5tPiCIm6pWUcjYK.jpg",
                    "en",
                    "2020-12-31",
                    6.1
                )
            )
            datas.add(
                MovieModel(
                    560144,
                    "/2W4ZvACURDyhiNnSIaFPHfNbny3.jpg",
                    "Skylines",
                    "When a virus threatens to turn the now earth-dwelling friendly alien hybrids against humans, Captain Rose Corley must lead a team of elite mercenaries on a mission to the alien world in order to save what's left of humanity.",
                    "/3ombg55JQiIpoPnXYb2oYdr6DtP.jpg",
                    "en",
                    "2020-12-18",
                    5.8
                )
            )
            datas.add(
                MovieModel(
                    517096,
                    "/eDJYDXRoWoUzxjd52gtz5ODTSU1.jpg",
                    "Cosmoball",
                    "Cosmoball is a mesmerizing intergalactic game of future played between humans and aliens at the giant extraterrestrial ship hovering in the sky over Earth. A young man with enormous power of an unknown nature joins the team of hot-headed superheroes in exchange for a cure for his mother’s deadly illness. The Four from Earth will fight not only to defend the honor of their home planet in the spectacular game, but to face the unprecedented threat to the Galaxy and embrace their own destiny.",
                    "/ibwOX4xUndc6E90MYfglghWvO5Z.jpg",
                    "ru",
                    "2020-08-27",
                    5.7
                )
            )
            datas.add(
                MovieModel(
                    604822,
                    "/vYvppZMvXYheYTWVd8Rnn9nsmNp.jpg",
                    "Vanguard",
                    "Covert security company Vanguard is the last hope of survival for an accountant after he is targeted by the world's deadliest mercenary organization.",
                    "/fX8e94MEWSuTJExndVYxKsmA4Hw.jpg",
                    "zh",
                    "2020-09-30",
                    7.2
                )
            )
            datas.add(
                MovieModel(
                    685571,
                    "/mSZnvJ0olvAss77b01Vf68or8xr.jpg",
                    "Copper Bill",
                    "Two thieves attempt to steal 80 million dollars of hidden Texas drug money from the famed ranch belonging to a dead member of the Cowboy Mafia.",
                    "/2uw62v6FTXg3yJTOIQVcUQcp0J.jpg",
                    "en",
                    "2020-09-30",
                    7.0
                )
            )
            datas.add(
                MovieModel(
                    755812,
                    "/kIHgjAkuzvKBnmdstpBOo4AfZah.jpg",
                    "Miraculous World: New York, United HeroeZ",
                    "During a school field trip, Ladybug and Cat Noir meet the American superheroes, whom they have to save from an akumatised super-villain. They discover that Miraculous exist in the United States too.",
                    "/yR27bZPIkNhpGEIP3jKV2EifTgo.jpg",
                    "fr",
                    "2020-10-10",
                    8.6
                )
            )
            datas.add(
                MovieModel(
                    651571,
                    "/13B6onhL6FzSN2KaNeQeMML05pS.jpg",
                    "Breach",
                    "A hardened mechanic must stay awake and maintain an interstellar ark fleeing the dying planet Earth with a few thousand lucky souls on board... the last of humanity. Unfortunately, humans are not the only passengers. A shapeshifting alien creature has taken residence, its only goal is to kill as many people as possible. The crew must think quickly to stop this menace before it destroys mankind.",
                    "/nz8xWrTKZzA5A7FgxaM4kfAoO1W.jpg",
                    "en",
                    "2020-12-17",
                    4.1
                )
            )
            datas.add(
                MovieModel(
                    737568,
                    "/pklyUbh4k1DbHdnsOMASyw7C6NH.jpg",
                    "The Doorman",
                    "A former Marine turned doorman at a luxury New York City high-rise must outsmart and battle a group of art thieves and their ruthless leader — while struggling to protect her sister's family. As the thieves become increasingly desperate and violent, the doorman calls upon her deadly fighting skills to end the showdown.",
                    "/9pHxv7TX0jOKNgnGMDP6RJ2m1GL.jpg",
                    "en",
                    "2020-10-01",
                    6.2
                )
            )
            datas.add(
                MovieModel(
                    614911,
                    "/51JxCk77ZCqLzbLkrDl9Qho6KUh.jpg",
                    "The Midnight Sky",
                    "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                    "/dueiWzWc81UAgnbDAyH4Gjqnh4n.jpg",
                    "en",
                    "2020-12-10",
                    5.9
                )
            )
            datas.add(
                MovieModel(
                    529203,
                    "/tK1zy5BsCt1J4OzoDicXmr0UTFH.jpg",
                    "The Croods: A New Age",
                    "Searching for a safer habitat, the prehistoric Crood family discovers an idyllic, walled-in paradise that meets all of its needs. Unfortunately, they must also learn to live with the Bettermans -- a family that's a couple of steps above the Croods on the evolutionary ladder. As tensions between the new neighbors start to rise, a new threat soon propels both clans on an epic adventure that forces them to embrace their differences, draw strength from one another, and survive together.",
                    "/cjaOSjsjV6cl3uXdJqimktT880L.jpg",
                    "en",
                    "2020-11-25",
                    7.7
                )
            )
            datas.add(
                MovieModel(
                    733317,
                    "/1f3qspv64L5FXrRy0MF8X92ieuw.jpg",
                    "Monsters of Man",
                    "A robotics company vying to win a lucrative military contract team up with a corrupt CIA agent to conduct an illegal live field test. They deploy four weaponized prototype robots into a suspected drug manufacturing camp in the Golden Triangle, assuming they'd be killing drug runners that no one would miss. Six doctors on a humanitarian mission witness the brutal slaughter and become prime targets.",
                    "/z15NpieRw7jL7bKoICwLO5j7FgZ.jpg",
                    "en",
                    "2020-11-19",
                    7.1
                )
            )
            datas.add(
                MovieModel(
                    553604,
                    "/zeD4PabP6099gpE0STWJrJrCBCs.jpg",
                    "Honest Thief",
                    "A bank robber tries to turn himself in because he's falling in love and wants to live an honest life...but when he realizes the Feds are more corrupt than him, he must fight back to clear his name.",
                    "/2M2JxEv3HSpjnZWjY9NOdGgfUd.jpg",
                    "en",
                    "2020-09-03",
                    6.7
                )
            )
            datas.add(
                MovieModel(
                    524047,
                    "/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                    "Greenland",
                    "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                    "/2Fk3AB8E9dYIBc2ywJkxk8BTyhc.jpg",
                    "en",
                    "2020-07-29",
                    7.1
                )
            )
            datas.add(
                MovieModel(
                    577922,
                    "/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                    "Tenet",
                    "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                    "/wzJRB4MKi3yK138bJyuL9nx47y6.jpg",
                    "en",
                    "2020-08-22",
                    7.3
                )
            )
            datas.add(
                MovieModel(
                    646593,
                    "/2AwPvNHphpZBJDqjZKVuMAbvS0v.jpg",
                    "Wander",
                    "After getting hired to probe a suspicious death in the small town of Wander, a mentally unstable private investigator becomes convinced the case is linked to the same 'conspiracy cover up' that caused the death of his daughter.",
                    "/wk58aoyWpMTVkKkdjw889XfWGdL.jpg",
                    "en",
                    "2020-12-04",
                    5.2
                )
            )
            datas.add(
                MovieModel(
                    615677,
                    "/1S21HpcKY6uQ9UAw68aICmrJaq6.jpg",
                    "We Can Be Heroes",
                    "When alien invaders capture Earth's superheroes, their kids must learn to work together to save their parents - and the planet.",
                    "/UgNke0mMQhQdnX2hEu4cN83M0a.jpg",
                    "en",
                    "2020-12-25",
                    6.2
                )
            )
            datas.add(
                MovieModel(
                    777350,
                    "/mMWLGu9pFymqipN8yvISHsAaj72.jpg",
                    "Dory's Reef Cam",
                    "Dive into the waters below and watch the aquatic wildlife from the world of Nemo and Dory.",
                    "/lWf1aiqDZqUbhrw8DnsfV8Ql7CP.jpg",
                    "en",
                    "2020-12-18",
                    6.2
                )
            )
            datas.add(
                MovieModel(
                    590706,
                    "/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                    "Jiu Jitsu",
                    "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                    "/jeAQdDX9nguP6YOX6QSWKDPkbBo.jpg",
                    "en",
                    "2020-11-20",
                    5.3
                )
            )
            datas.add(
                MovieModel(
                    8984,
                    "/m10Sx3ikuXhJomFnN3OYpkBpYEc.jpg",
                    "Disclosure",
                    "A computer specialist is sued for sexual harassment by a former lover turned boss who initiated the act forcefully, which threatens both his career and his personal life.",
                    "/4A0f1oqkJLohy8LXjmJpops7CMB.jpg",
                    "en",
                    "1994-03-10",
                    6.3
                )
            )
            datas.add(
                MovieModel(
                    441282,
                    "/vVYU0x9FRpiJNX7c54ciFnRBVYG.jpg",
                    "Night Hunter",
                    "A Minnesota police officer crosses paths with a committed and tireless vigilante as he follows the trail of a ruthless predator responsible for several abductions and murders.",
                    "/8knaRrDd1FM1pbSLaViEQSxodi5.jpg",
                    "en",
                    "2019-08-29",
                    6.5
                )
            )
            datas.add(
                MovieModel(
                    716703,
                    "/zjGrlEuENSjRZGWc8N10zq3Jjkq.jpg",
                    "What Lies Below",
                    "Liberty, a socially awkward 16-year-old, returns from two months at camp to a blindsided introduction of her mother’s fiancé, John Smith, whose charm, intelligence, and beauty paint the picture of a man too perfect to be human.",
                    "/qLL6H9SGEwRRW6PJHixyUtbBjBE.jpg",
                    "en",
                    "2020-12-17",
                    6.4
                )
            )
            datas.add(
                MovieModel(
                    648371,
                    "/27BnREBR5rcMrUVUhV5bTXlcCym.jpg",
                    "No Good Deed",
                    "Karen never planned on being a hero. A recent widow, she has her hands full with work and parenting her son Max. Then Karen saves Jeremy's life during a drug store robbery and quickly discovers that the young man is intent on paying her back at any cost. At first, life starts improving for this good Samaritan, but as Jeremy's efforts become more extreme, Karen starts to wonder if no good deed truly goes unpunished.",
                    "/lrzAb9QCwKPOwH1iY7WpfjR6jcC.jpg",
                    "en",
                    "2020-03-13",
                    6.4
                )
            )
            datas.add(
                MovieModel(
                    635237,
                    "/chGTXsvn53XvEnvsJ9ZD9eiYKx9.jpg",
                    "Arthur & Merlin: Knights of Camelot",
                    "King Arthur returns home after fighting the Roman Empire. His illegitimate son has corrupted the throne of Camelot and King Arthur must reunite with the wizard Merlin and the Knights of the Round Table to fight to get back his crown.",
                    "/sFLgXQGrSWxnjmPOpGKPApWNOUH.jpg",
                    "pt",
                    "2020-05-28",
                    5.3
                )
            )
            datas.add(
                MovieModel(
                    613504,
                    "/kiX7UYfOpYrMFSAGbI6j1pFkLzQ.jpg",
                    "After We Collided",
                    "Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever.",
                    "/6hgItrYQEG33y0I7yP2SRl2ei4w.jpg",
                    "en",
                    "2020-09-02",
                    7.3
                )
            )
            datas.add(
                MovieModel(
                    581392,
                    "/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                    "Peninsula",
                    "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                    "/d2UxKyaJ5GgzuHaSsWinFfv3g6L.jpg",
                    "ko",
                    "2020-07-15",
                    7.0
                )
            )
            datas.add(
                MovieModel(
                    634244,
                    "/cLDPLia17AwMqSaRHccyAlInkch.jpg",
                    "Heavenquest: A Pilgrim's Progress",
                    "Inspired by the 1678 novel The Pilgrim's Progress and an imagined prequel to Bunyan's original writings.  A regal man named Vangel is thrust on a journey against his will when he is suddenly and mysteriously arrested.  Injured and lost after escaping the dark king’s men, Vangel begins to have strange dreams and visions of a mysterious woman in white calling him from the unknown territory of the North.  Armed with a book called “The Record of the Ancients” that he receives from a wise sage named Elder, Vangel embarks on an adventure that takes him through treacherous mountain range, unending deserts, the Lake of Doubts, and the Forest of No Return.  Along the way, travel companions share about a fabled good king and his son in the North if he can make it there alive.",
                    "/cw8A0SprTxr7uSfcH7lwSRRhezJ.jpg",
                    "en",
                    "2020-07-13",
                    5.3
                )
            )
            datas.add(
                MovieModel(
                    749618,
                    "/ssk0Gd27ziryP2OUxprIVhAvr3e.jpg",
                    "Xico's Journey",
                    "The peace of a small town is endangered when a corporation wants to destroy the mountain that protects them. A girl named Copi and her best friend Xico, a Xoloitzcuintle dog, will go into the mountains to try to save the town.",
                    "/h3dqQ1uqHsNwIVDufe9AzI7KgVS.jpg",
                    "es",
                    "2020-11-12",
                    6.9
                )
            )
            datas.add(
                MovieModel(
                    320846,
                    "/ne2xAzlgSaWvBrYGw2LkO8W5pHi.jpg",
                    "Sky Sharks",
                    "A team of Arctic geologists stumble across an abandoned laboratory in which the Nazis developed an incredible and brutal secret weapon during the final months of WW2. Deep in the ice, they accidentally awake a deadly army of flying zombie sharks ridden by genetically mutated, undead super-humans, who are unleashed into the skies, wreaking their bloodthirsty revenge on any aircraft that takes to the air. An elite task force is assembled to take on this deadly threat and stop the Sky Sharks from conquering the air, but as time runs out, the task force realises they will have to fight fire with fire, and the stage is set for the greatest flying super-mutant zombie shark air battle the world has ever seen....",
                    "/wKAidKCypwuxtZfZ4iP584PsWXV.jpg",
                    "en",
                    "2020-10-07",
                    4.7
                )
            )
            datas.add(
                MovieModel(
                    602211,
                    "/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                    "Fatman",
                    "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                    "/ckfwfLkl0CkafTasoRw5FILhZAS.jpg",
                    "en",
                    "2020-11-13",
                    5.5
                )
            )
            datas.add(
                MovieModel(
                    641662,
                    "/OgUfLlhfBFx5BPK6LzBWFvBW1w.jpg",
                    "Pieces of a Woman",
                    "When a young mother's home birth ends in unfathomable tragedy, she begins a year-long odyssey of mourning that fractures relationships with loved ones in this deeply personal story of a woman learning to live alongside her loss.",
                    "/izNpxVcjKbF9BiYF4GVqxCOfewL.jpg",
                    "en",
                    "2020-12-30",
                    7.1
                )
            )
            datas.add(
                MovieModel(
                    400160,
                    "/jlJ8nDhMhCYJuzOw3f52CP1W8MW.jpg",
                    "The SpongeBob Movie: Sponge on the Run",
                    "When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.",
                    "/wu1uilmhM4TdluKi2ytfz8gidHf.jpg",
                    "en",
                    "2020-08-14",
                    7.9
                )
            )
            datas.add(
                MovieModel(
                    334521,
                    "/21WsmKivqOE2Vut73z07M8yx84F.jpg",
                    "Free Fire",
                    "A crime drama set in 1970s Boston, about a gun sale which goes wrong.",
                    "/qUg005Yer0DQOW3l45jrwP0rTvo.jpg",
                    "en",
                    "2017-03-31",
                    6.3
                )
            )
            datas.add(
                MovieModel(
                    505746,
                    "/f4xfU5BUrdDeOgt3J6drQGNjfZk.jpg",
                    "Asphalt Burning",
                    "The third and final instalment in the Burnout trilogy. This time, the road leads trough Norway, to Sweden, Denmark and finally Germany to race on the famous racing track, Nürburgring.",
                    "/zxHHmvUYlYhBuBmZpIrjnamCO3c.jpg",
                    "no",
                    "2020-10-14",
                    5.1
                )
            )
            datas.add(
                MovieModel(
                    773655,
                    "/w9FPFsPkeiBDn6WwDHFgniWdVJm.jpg",
                    "Death to 2020",
                    "2020: A year so [insert adjective of choice here] even the creators of Black Mirror couldn't make it up… but that doesn't mean they don't have a little something to add. This comedy event that tells the story of the dreadful year that was — and perhaps still is? The documentary-style special weaves together some of the world's most (fictitious) renowned voices with real-life archival footage.",
                    "/xxEec408VQY7TIvtpxdkUM3Fux6.jpg",
                    "en",
                    "2020-12-27",
                    6.8
                )
            )
            datas.add(
                MovieModel(
                    718022,
                    "/2b2d6i3LZHRaGUwIGcw4h1Wecz6.jpg",
                    "Heks",
                    "A grieving British girl unravels her murdered mother's secrets connected to a South African witch doctor's curse. She wants to put an end to this haunting hex by traveling to South Africa, but instead it casts her deeper into sinister depths.",
                    "/2b2d6i3LZHRaGUwIGcw4h1Wecz6.jpg",
                    "en",
                    "2020-12-15",
                    3.5
                )
            )
            datas.add(
                MovieModel(
                    652962,
                    "/Apl0WFx61trVOoxvc8Erd5cbP8X.jpg",
                    "Half Brothers",
                    "A story about the complex connection with a brother who is based in Mexico, meant to be a metaphor of the relationship between neighboring countries America and Mexico.",
                    "/umrpNeJooAyfvgPuOutNQHZdJ2p.jpg",
                    "en",
                    "2020-12-04",
                    7.8
                )
            )
            datas.add(
                MovieModel(
                    531219,
                    "/b1C0FuXp4wiPmHLVKq4kwtDMgK6.jpg",
                    "Roald Dahl's The Witches",
                    "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered.",
                    "/8rIoyM6zYXJNjzGseT3MRusMPWl.jpg",
                    "en",
                    "2020-10-25",
                    6.8
                )
            )
            datas.add(
                MovieModel(
                    765123,
                    "/ajKpYK7XdzIYjy9Uy8nkgRboKyv.jpg",
                    "Christmas Crossfire",
                    "A man foils an attempted murder, then flees the crew of would-be killers along with their intended target as a woman he's just met tries to find him.",
                    "/zMcEalkxEiRjvmijliLBk0sYern.jpg",
                    "de",
                    "2020-12-04",
                    4.6
                )
            )
            return datas
        }

        fun generateTvShow(): ArrayList<TvShowModel> {
            val data = arrayListOf<TvShowModel>()
            data.add(
                TvShowModel(
                    77169,
                    "/obLBdhLxheKg8Li1qO11r2SwmYO.jpg",
                    "Cobra Kai",
                    "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                    "/gL8myjGc2qrmqVosyGm5CWTir9A.jpg",
                    "en",
                    "2018-05-02",
                    8.1
                )
            )
            data.add(
                TvShowModel(
                    82856,
                    "/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                    "The Mandalorian",
                    "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                    "/o7qi2v4uWQ8bZ1tW3KI0Ztn2epk.jpg",
                    "en",
                    "2019-11-12",
                    8.5
                )
            )
            data.add(
                TvShowModel(
                    44217,
                    "/bQLrHIRNEkE3PdIWQrZHynQZazu.jpg",
                    "Vikings",
                    "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                    "/aq2yEMgRQBPfRkrO0Repo2qhUAT.jpg",
                    "en",
                    "2013-03-03",
                    8.0
                )
            )
            data.add(
                TvShowModel(
                    96677,
                    "/sgxawbFB5Vi5OkPWQLNfl3dvkNJ.jpg",
                    "Lupin",
                    "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                    "/lbWUCXIeoVXowAtLlAVR3aeHjkT.jpg",
                    "fr",
                    "2021-01-08",
                    8.1
                )
            )
            data.add(
                TvShowModel(
                    71712,
                    "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                    "The Good Doctor",
                    "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                    "/mZjZgY6ObiKtVuKVDrnS9VnuNlE.jpg",
                    "en",
                    "2017-09-25",
                    8.6
                )
            )
            data.add(
                TvShowModel(
                    79242,
                    "/yxMpoHO0CXP5o9gB7IfsciilQS4.jpg",
                    "Chilling Adventures of Sabrina",
                    "As her 16th birthday nears, Sabrina must choose between the witch world of her family and the human world of her friends. Based on the Archie comic.",
                    "/8AdmUPTyidDebwIuakqkSt6u1II.jpg",
                    "en",
                    "2018-10-26",
                    8.4
                )
            )
            data.add(
                TvShowModel(
                    85271,
                    "/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                    "WandaVision",
                    "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                    "/lOr9NKxh4vMweufMOUDJjJhCRHW.jpg",
                    "en",
                    "2021-01-15",
                    8.5
                )
            )
            data.add(
                TvShowModel(
                    1416,
                    "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                    "Grey's Anatomy",
                    "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                    "/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
                    "en",
                    "2005-03-27",
                    8.2
                )
            )
            data.add(
                TvShowModel(
                    69050,
                    "/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                    "Riverdale",
                    "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of real small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                    "/9hvhGtcsGhQY58pukw8w55UEUbL.jpg",
                    "en",
                    "2017-01-26",
                    8.6
                )
            )
            data.add(
                TvShowModel(
                    91239,
                    "/qaewZKBKmXjb4ZfFBb1LCug6BE8.jpg",
                    "Bridgerton",
                    "Wealth, lust, and betrayal set in the backdrop of Regency era England, seen through the eyes of the powerful Bridgerton family.",
                    "/m7FqiUOvsSk7Ulg2oRMfFGcLeT9.jpg",
                    "en",
                    "2020-12-25",
                    8.3
                )
            )
            data.add(
                TvShowModel(
                    86382,
                    "/w6XiuRK5QQaLNmIqDRCWOpEcHwi.jpg",
                    "The Stand",
                    "In a world mostly wiped out by the plague and embroiled in an elemental struggle between good and evil, the fate of mankind rests on the frail shoulders of the 108-year-old Mother Abagail and a handful of survivors. Their worst nightmares are embodied in a man with a lethal smile and unspeakable powers: Randall Flagg, the Dark Man.",
                    "/b7MUOLzo9kxQRSjGHwp589HMdxI.jpg",
                    "en",
                    "2020-12-17",
                    7.2
                )
            )
            data.add(
                TvShowModel(
                    75006,
                    "/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                    "The Umbrella Academy",
                    "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                    "/mE3zzMkpP8yqlkzdjPsQmJHceoe.jpg",
                    "en",
                    "2019-02-15",
                    8.7
                )
            )
            data.add(
                TvShowModel(
                    110316,
                    "/20mOwAAPwZ1vLQkw0fvuQHiG7bO.jpg",
                    "Alice in Borderland",
                    "With his two friends, a video-game-obsessed young man finds himself in a strange version of Tokyo where they must compete in dangerous games to win.",
                    "/bKxiLRPVWe2nZXCzt6JPr5HNWYm.jpg",
                    "ja",
                    "2020-12-10",
                    8.3
                )
            )
            data.add(
                TvShowModel(
                    63174,
                    "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                    "Lucifer",
                    "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                    "/ta5oblpMlEcIPIS2YGcq9XEkWK2.jpg",
                    "en",
                    "2016-01-25",
                    8.5
                )
            )
            data.add(
                TvShowModel(
                    95479,
                    "/g1rK2nRXSidcMwNliWDIroWWGTn.jpg",
                    "Jujutsu Kaisen",
                    "Yuuji Itadori is a boy with tremendous physical strength, though he lives a completely ordinary high school life. One day, to save a friend who has been attacked by Curses, he eats a finger of Ryoumen Sukuna, taking the Curse into his own soul. From then on, he shares one body with Sukuna. Guided by the most powerful of sorcerers, Satoru Gojou, Itadori is admitted to the Tokyo Prefectural Jujutsu High School, an organization that fights the Curses... and thus begins the heroic tale of a boy who became a Curse to exorcise a Curse, a life from which he could never turn back.",
                    "/lthkKBLe1rX6iThgVFg22O02sJw.jpg",
                    "ja",
                    "2020-10-03",
                    8.7
                )
            )
            data.add(
                TvShowModel(
                    111499,
                    "/xYsNIxKD7JTg3hi03U2TlBFTGKI.jpg",
                    "De brutas, nada",
                    "In a contemporary Mexico City, a group of six sophisticated close friends navigate through every life experience imaginable together: love, lies, heartbreak, marriage, divorce, kids, career, job loss, fights, break-ups, and unbreakable friendships.",
                    "/y4Ia5VeYMWKFMk04lrOXkHrzwTt.jpg",
                    "es",
                    "2020-06-11",
                    8.1
                )
            )
            data.add(
                TvShowModel(
                    1399,
                    "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                    "Game of Thrones",
                    "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                    "/suopoADq0k8YZr4dQXcU6pToj6s.jpg",
                    "en",
                    "2011-04-17",
                    8.4
                )
            )
            data.add(
                TvShowModel(
                    89844,
                    "/b2i9aaV6ncULl9jYXEoPi7VFJg8.jpg",
                    "30 Coins",
                    "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                    "/uSvncE20Mh3seJLIHLEQnt0OcBv.jpg",
                    "es",
                    "2020-11-29",
                    6.8
                )
            )
            data.add(
                TvShowModel(
                    18165,
                    "/aBkVgChtyyJaHyZh1gfd8DbzQon.jpg",
                    "The Vampire Diaries",
                    "The story of two vampire brothers obsessed with the same girl, who bears a striking resemblance to the beautiful but ruthless vampire they knew and loved in 1864.",
                    "/k7T9xRyzP41wBVNyNeLmh8Ch7gD.jpg",
                    "en",
                    "2009-09-10",
                    8.3
                )
            )
            data.add(
                TvShowModel(
                    113600,
                    "/bnU3Rz3nR844WZNOyrCk8W52DUs.jpg",
                    "Equinox",
                    "Haunted by visions after her sister vanished with her classmates 21 years before, Astrid begins an investigation that uncovers the dark, eerie truth.",
                    "/1IO3hNWCeGStVuCopf6bJnazWyz.jpg",
                    "da",
                    "2020-12-30",
                    7.7
                )
            )
            data.add(
                TvShowModel(
                    96648,
                    "/6eMg81CPLalULg8spPt2LxfQtFj.jpg",
                    "Sweet Home",
                    "Cha Hyun-Soo is a high school student. He is also a recluse and rarely leaves his room. He refuses to talk to his father, mother and younger sister. One day, his whole family, except for him, dies in a car accident. Cha Hyun-Soo is left all alone. He moves into a small apartment. At this time, a mysterious phenomenon of humans turning into monster occur all around the world. The residents of Cha Hyun-Soo's apartment building, including Pyeon Sang-Wook, fight against these monsters and try to survive.",
                    "/9PaJZrGW5qYXfSVJYAmKIEEQMdH.jpg",
                    "ko",
                    "2020-12-18",
                    8.6
                )
            )
            data.add(
                TvShowModel(
                    87739,
                    "/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                    "The Queen's Gambit",
                    "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                    "/34OGjFEbHj0E3lE2w0iTUVq0CBz.jpg",
                    "en",
                    "2020-10-23",
                    8.7
                )
            )
            data.add(
                TvShowModel(
                    456,
                    "/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg",
                    "The Simpsons",
                    "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                    "/hpU2cHC9tk90hswCFEpf5AtbqoL.jpg",
                    "en",
                    "1989-12-16",
                    7.8
                )
            )
            data.add(
                TvShowModel(
                    48866,
                    "/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg",
                    "The 100",
                    "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                    "/hTExot1sfn7dHZjGrk0Aiwpntxt.jpg",
                    "en",
                    "2014-03-19",
                    7.8
                )
            )
            data.add(
                TvShowModel(
                    113367,
                    "/gHBtyMdHbWoM3tpM8VZymer8HfF.jpg",
                    "The Wilds",
                    "A group of teen girls from different backgrounds must fight for survival after a plane crash strands them on a deserted island. The castaways both clash and bond as they learn more about each other, the secrets they keep, and the traumas they've all endured. But there’s just one twist… these girls did not end up on this island by accident.",
                    "/rgBxEVr44C00hBg3jLicxWMy9yy.jpg",
                    "en",
                    "2020-12-11",
                    8.0
                )
            )
            data.add(
                TvShowModel(
                    46260,
                    "/vauCEnR7CiyBDzRCeElKkCaXIYu.jpg",
                    "Naruto",
                    "In another world, ninja are the ultimate power, and in the Village Hidden in the Leaves live the stealthiest ninja in the land. Twelve years earlier, the fearsome Nine-Tailed Fox terrorized the village and claimed many lives before it was subdued and its spirit sealed within the body of a baby boy. That boy, Naruto Uzumaki, has grown up to become a ninja-in-training who's more interested in pranks than in studying ninjutsu.. but Naruto is determined to become the greatest ninja ever!",
                    "/oycArCLGgtWyUz5aho7ojFZkgjN.jpg",
                    "ja",
                    "2002-10-03",
                    8.4
                )
            )
            data.add(
                TvShowModel(
                    76479,
                    "/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg",
                    "The Boys",
                    "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                    "/mGVrXeIjyecj6TKmwPVpHlscEmw.jpg",
                    "en",
                    "2019-07-25",
                    8.5
                )
            )
            data.add(
                TvShowModel(
                    94167,
                    "/jTDpdYASFxX45GWkGPHmS74BNvz.jpg",
                    "El Cid",
                    "The story of Rodrigo Díaz de Vivar, a Castilian nobleman and war hero in medieval Spain.",
                    "/3Ehu0zk1XLvt5SfcRjZDcKbmFac.jpg",
                    "es",
                    "2020-12-18",
                    6.9
                )
            )
            data.add(
                TvShowModel(
                    44953,
                    "/Ag7VUdnrRz5Qpq3Yn3E5OCvFnu0.jpg",
                    "The Lord of the Skies",
                    "Set in the 1990s, these are the life and times of Amado Carrillo Fuentes, a man who became the head of the Juárez cartel. Nicknamed “El Señor de los Cielos” (Lord of the Skies) because of the large fleet of airplanes he used to transport drugs, he was also known for washing more than $200 million through Colombia to finance his huge fleet. He is described as the most powerful drug trafficker of his time.",
                    "/qsTlD6rYb5vXOlBTT9Lj2hBp44X.jpg",
                    "es",
                    "2013-04-15",
                    7.7
                )
            )
            data.add(
                TvShowModel(
                    62286,
                    "/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                    "Fear the Walking Dead",
                    "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                    "/92B6765nyQkIW8yLWt3pNcS6Cip.jpg",
                    "en",
                    "2015-08-23",
                    7.5
                )
            )
            data.add(
                TvShowModel(
                    91605,
                    "/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                    "I Am...",
                    "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                    "/wgEWTYAAY7F04o4F20j0L1DGB8i.jpg",
                    "en",
                    "2019-07-23",
                    5.6
                )
            )
            data.add(
                TvShowModel(
                    94413,
                    "/lO3JkTPko8kEr2luYGwQocU1lJH.jpg",
                    "The Mess You Leave Behind",
                    "A teacher starts her job at a high school but is haunted by a suspicious death that occurred there weeks before and begins fearing for her own life.",
                    "/8FDb3FUNGEeiPmHG00Onlu6xVnE.jpg",
                    "es",
                    "2020-12-11",
                    5.1
                )
            )
            data.add(
                TvShowModel(
                    97180,
                    "/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg",
                    "Selena: The Series",
                    "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                    "/Wu8kh7oyvaIfkNyMJyJHCamh5L.jpg",
                    "en",
                    "2020-12-04",
                    7.5
                )
            )
            data.add(
                TvShowModel(
                    1402,
                    "/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg",
                    "The Walking Dead",
                    "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                    "/wXXaPMgrv96NkH8KD1TMdS2d7iq.jpg",
                    "en",
                    "2010-10-31",
                    8.0
                )
            )
            data.add(
                TvShowModel(
                    60735,
                    "/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                    "The Flash",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                    "/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg",
                    "en",
                    "2014-10-07",
                    7.6
                )
            )
            data.add(
                TvShowModel(
                    76669,
                    "/3NTAbAiao4JLzFQw6YxP1YZppM8.jpg",
                    "Elite",
                    "When three working class kids enroll in the most exclusive school in Spain, the clash between the wealthy and the poor students leads to tragedy.",
                    "/1qOA3kMtQO8bjnW8M2smjA8tp10.jpg",
                    "es",
                    "2018-10-05",
                    8.3
                )
            )
            data.add(
                TvShowModel(
                    66732,
                    "/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                    "Stranger Things",
                    "When a young boy vanishes, a small town uncovers a mystery involving secret experiments, terrifying supernatural forces, and one strange little girl.",
                    "/56v2KjBlU4XaOv9rVYEQypROD7P.jpg",
                    "en",
                    "2016-07-15",
                    8.6
                )
            )
            data.add(
                TvShowModel(
                    71789,
                    "/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                    "SEAL Team",
                    "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                    "/iCBMJZFsdXALgpS121qu4CAe2Sa.jpg",
                    "en",
                    "2017-09-27",
                    7.8
                )
            )
            data.add(
                TvShowModel(
                    67335,
                    "/ulcGG2JKjbVMQFIux1vcQGN1pQi.jpg",
                    "Sin senos sí hay paraíso",
                    "A young woman born in a mafia-controlled town seeks revenge on those who wrongfully harmed and imprisoned her family.",
                    "/oAkpvVvoyZWMo9cpNk3aQoVKsjM.jpg",
                    "es",
                    "2016-07-19",
                    7.5
                )
            )
            data.add(
                TvShowModel(
                    4604,
                    "/pUhJGETy2sec4vEkiqJ9eGeIywc.jpg",
                    "Smallville",
                    "The origins of the world’s greatest hero–from Krypton refugee Kal-el’s arrival on Earth through his tumultuous teen years to Clark Kent’s final steps toward embracing his destiny as the Man of Steel.",
                    "/kuOt3LxmHW8k39SK2tyg6qSWhop.jpg",
                    "en",
                    "2001-10-16",
                    8.1
                )
            )
            return data
        }

        fun generateDataMovieEntity(): List<MovieEntity> {
            val retData = arrayListOf<MovieEntity>()
            generateRemoteDummyMovie().forEach {
                retData.add(
                    MovieEntity(
                        false,
                        it.backdrop_path,
                        it.id,
                        it.original_language,
                        it.original_title,
                        it.overview,
                        it.popularity,
                        it.poster_path,
                        it.release_date,
                        it.title,
                        it.video,
                        it.vote_average,
                        it.vote_count
                    )
                )
            }
            return retData
        }

        fun generateDataTvEntity(): List<TvEntity> {
            val retData = arrayListOf<TvEntity>()
            generateRemoteDummyTvShow().forEach {
                retData.add(
                    TvEntity(
                        it.backdrop_path,
                        it.id,
                        it.original_language,
                        it.overview,
                        it.popularity,
                        it.poster_path,
                        it.vote_average,
                        it.vote_count,
                        it.first_air_date,
                        it.name,
                        it.original_name
                    )
                )
            }
            return retData
        }

        fun getDataTvDetail(tvId: Int): FilmDetailEntity {
            var retData: FilmDetailEntity? = null
            generateDataTvEntity().forEach {
                if (tvId == it.id) retData = FilmDetailEntity(
                    it.name,
                    it.backdrop_path,
                    it.id,
                    it.original_language,
                    it.overview,
                    it.popularity,
                    it.poster_path,
                    it.first_air_date,
                    it.vote_average,
                    it.vote_count
                )
            }

            return retData as FilmDetailEntity
        }

        fun getDataMovieDetail(movieId: Int): FilmDetailEntity {
            var retData: FilmDetailEntity? = null
            generateDataMovieEntity().forEach {
                if (movieId == it.id) retData = FilmDetailEntity(
                    it.title,
                    it.backdrop_path,
                    it.id,
                    it.original_language,
                    it.overview,
                    it.popularity,
                    it.poster_path,
                    it.release_date,
                    it.vote_average,
                    it.vote_count
                )
            }

            return retData as FilmDetailEntity
        }

        fun generateRemoteDummyMovie(): List<MovieResponse> {
            val movies = arrayListOf<MovieResponse>()
            movies.add(
                MovieResponse(
                    false,
                    "/srYya1ZlI97Au4jUYAktDe3avyA.jpg",
                    464052,
                    "en",
                    "Wonder Woman 1984",
                    "Wonder Woman comes into conflict with the Soviet Union during the Cold War in the 1980s and finds a formidable foe by the name of the Cheetah.",
                    3663.168,
                    "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                    "2020-12-16",
                    "Wonder Woman 1984",
                    false,
                    7.2,
                    2727
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/kf456ZqeC45XTvo6W9pW5clYKfQ.jpg",
                    508442,
                    "en",
                    "Soul",
                    "Joe Gardner is a middle school teacher with a love for jazz music. After a successful gig at the Half Note Club, he suddenly gets into an accident that separates his soul from his body and is transported to the You Seminar, a center in which souls develop and gain passions before being transported to a newborn child. Joe must enlist help from the other souls-in-training, like 22, a soul who has spent eons in the You Seminar, in order to get back to Earth.",
                    2925.462,
                    "/hm58Jw4Lw8OIeECIq5qyPYhAeRJ.jpg",
                    "2020-12-25",
                    "Soul",
                    false,
                    8.3,
                    3622
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/aHYUj0hICtWZ5tPiCIm6pWUcjYK.jpg",
                    675327,
                    "en",
                    "Shadow in the Cloud",
                    "A WWII pilot traveling with top secret documents on a B-17 Flying Fortress encounters an evil presence on board the flight.",
                    2896.978,
                    "/t7EUMSlfUN3jUSZUJOLURAzJzZs.jpg",
                    "2020-12-31",
                    "Shadow in the Cloud",
                    false,
                    6.1,
                    138
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/3ombg55JQiIpoPnXYb2oYdr6DtP.jpg",
                    560144,
                    "en",
                    "Skylines",
                    "When a virus threatens to turn the now earth-dwelling friendly alien hybrids against humans, Captain Rose Corley must lead a team of elite mercenaries on a mission to the alien world in order to save what's left of humanity.",
                    2193.072,
                    "/2W4ZvACURDyhiNnSIaFPHfNbny3.jpg",
                    "2020-12-18",
                    "Skylines",
                    false,
                    5.8,
                    46
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/ibwOX4xUndc6E90MYfglghWvO5Z.jpg",
                    517096,
                    "ru",
                    "Вратарь Галактики",
                    "Cosmoball is a mesmerizing intergalactic game of future played between humans and aliens at the giant extraterrestrial ship hovering in the sky over Earth. A young man with enormous power of an unknown nature joins the team of hot-headed superheroes in exchange for a cure for his mother’s deadly illness. The Four from Earth will fight not only to defend the honor of their home planet in the spectacular game, but to face the unprecedented threat to the Galaxy and embrace their own destiny.",
                    1810.563,
                    "/eDJYDXRoWoUzxjd52gtz5ODTSU1.jpg",
                    "2020-08-27",
                    "Cosmoball",
                    false,
                    5.7,
                    71
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/fX8e94MEWSuTJExndVYxKsmA4Hw.jpg",
                    604822,
                    "zh",
                    "急先锋",
                    "Covert security company Vanguard is the last hope of survival for an accountant after he is targeted by the world's deadliest mercenary organization.",
                    1588.799,
                    "/vYvppZMvXYheYTWVd8Rnn9nsmNp.jpg",
                    "2020-09-30",
                    "Vanguard",
                    false,
                    7.2,
                    134
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/2uw62v6FTXg3yJTOIQVcUQcp0J.jpg",
                    685571,
                    "en",
                    "Copper Bill",
                    "Two thieves attempt to steal 80 million dollars of hidden Texas drug money from the famed ranch belonging to a dead member of the Cowboy Mafia.",
                    1517.572,
                    "/mSZnvJ0olvAss77b01Vf68or8xr.jpg",
                    "2020-09-30",
                    "Copper Bill",
                    false,
                    7.0,
                    10
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/yR27bZPIkNhpGEIP3jKV2EifTgo.jpg",
                    755812,
                    "fr",
                    "Miraculous World: New York, United HeroeZ",
                    "During a school field trip, Ladybug and Cat Noir meet the American superheroes, whom they have to save from an akumatised super-villain. They discover that Miraculous exist in the United States too.",
                    1500.054,
                    "/kIHgjAkuzvKBnmdstpBOo4AfZah.jpg",
                    "2020-10-10",
                    "Miraculous World: New York, United HeroeZ",
                    false,
                    8.6,
                    277
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/nz8xWrTKZzA5A7FgxaM4kfAoO1W.jpg",
                    651571,
                    "en",
                    "Breach",
                    "A hardened mechanic must stay awake and maintain an interstellar ark fleeing the dying planet Earth with a few thousand lucky souls on board... the last of humanity. Unfortunately, humans are not the only passengers. A shapeshifting alien creature has taken residence, its only goal is to kill as many people as possible. The crew must think quickly to stop this menace before it destroys mankind.",
                    1386.865,
                    "/13B6onhL6FzSN2KaNeQeMML05pS.jpg",
                    "2020-12-17",
                    "Breach",
                    false,
                    4.1,
                    48
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/9pHxv7TX0jOKNgnGMDP6RJ2m1GL.jpg",
                    737568,
                    "en",
                    "The Doorman",
                    "A former Marine turned doorman at a luxury New York City high-rise must outsmart and battle a group of art thieves and their ruthless leader — while struggling to protect her sister's family. As the thieves become increasingly desperate and violent, the doorman calls upon her deadly fighting skills to end the showdown.",
                    1360.423,
                    "/pklyUbh4k1DbHdnsOMASyw7C6NH.jpg",
                    "2020-10-01",
                    "The Doorman",
                    false,
                    6.2,
                    120
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/dueiWzWc81UAgnbDAyH4Gjqnh4n.jpg",
                    614911,
                    "en",
                    "The Midnight Sky",
                    "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                    1309.808,
                    "/51JxCk77ZCqLzbLkrDl9Qho6KUh.jpg",
                    "2020-12-10",
                    "The Midnight Sky",
                    false,
                    5.9,
                    915
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/cjaOSjsjV6cl3uXdJqimktT880L.jpg",
                    529203,
                    "en",
                    "The Croods: A New Age",
                    "Searching for a safer habitat, the prehistoric Crood family discovers an idyllic, walled-in paradise that meets all of its needs. Unfortunately, they must also learn to live with the Bettermans -- a family that's a couple of steps above the Croods on the evolutionary ladder. As tensions between the new neighbors start to rise, a new threat soon propels both clans on an epic adventure that forces them to embrace their differences, draw strength from one another, and survive together.",
                    1266.684,
                    "/tK1zy5BsCt1J4OzoDicXmr0UTFH.jpg",
                    "2020-11-25",
                    "The Croods: A New Age",
                    false,
                    7.7,
                    1142
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/z15NpieRw7jL7bKoICwLO5j7FgZ.jpg",
                    733317,
                    "en",
                    "Monsters of Man",
                    "A robotics company vying to win a lucrative military contract team up with a corrupt CIA agent to conduct an illegal live field test. They deploy four weaponized prototype robots into a suspected drug manufacturing camp in the Golden Triangle, assuming they'd be killing drug runners that no one would miss. Six doctors on a humanitarian mission witness the brutal slaughter and become prime targets.",
                    1221.04,
                    "/1f3qspv64L5FXrRy0MF8X92ieuw.jpg",
                    "2020-11-19",
                    "Monsters of Man",
                    false,
                    7.1,
                    123
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/2M2JxEv3HSpjnZWjY9NOdGgfUd.jpg",
                    553604,
                    "en",
                    "Honest Thief",
                    "A bank robber tries to turn himself in because he's falling in love and wants to live an honest life...but when he realizes the Feds are more corrupt than him, he must fight back to clear his name.",
                    1100.788,
                    "/zeD4PabP6099gpE0STWJrJrCBCs.jpg",
                    "2020-09-03",
                    "Honest Thief",
                    false,
                    6.7,
                    462
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/2Fk3AB8E9dYIBc2ywJkxk8BTyhc.jpg",
                    524047,
                    "en",
                    "Greenland",
                    "John Garrity, his estranged wife and their young son embark on a perilous journey to find sanctuary as a planet-killing comet hurtles toward Earth. Amid terrifying accounts of cities getting levelled, the Garrity's experience the best and worst in humanity. As the countdown to the global apocalypse approaches zero, their incredible trek culminates in a desperate and last-minute flight to a possible safe haven.",
                    1060.068,
                    "/bNo2mcvSwIvnx8K6y1euAc1TLVq.jpg",
                    "2020-07-29",
                    "Greenland",
                    false,
                    7.1,
                    1378
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/wzJRB4MKi3yK138bJyuL9nx47y6.jpg",
                    577922,
                    "en",
                    "Tenet",
                    "Armed with only one word - Tenet - and fighting for the survival of the entire world, the Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
                    1048.026,
                    "/k68nPLbIST6NP96JmTxmZijEvCA.jpg",
                    "2020-08-22",
                    "Tenet",
                    false,
                    7.3,
                    3927
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/wk58aoyWpMTVkKkdjw889XfWGdL.jpg",
                    646593,
                    "en",
                    "Wander",
                    "After getting hired to probe a suspicious death in the small town of Wander, a mentally unstable private investigator becomes convinced the case is linked to the same 'conspiracy cover up' that caused the death of his daughter.",
                    897.211,
                    "/2AwPvNHphpZBJDqjZKVuMAbvS0v.jpg",
                    "2020-12-04",
                    "Wander",
                    false,
                    5.2,
                    80
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/UgNke0mMQhQdnX2hEu4cN83M0a.jpg",
                    615677,
                    "en",
                    "We Can Be Heroes",
                    "When alien invaders capture Earth's superheroes, their kids must learn to work together to save their parents - and the planet.",
                    886.554,
                    "/1S21HpcKY6uQ9UAw68aICmrJaq6.jpg",
                    "2020-12-25",
                    "We Can Be Heroes",
                    false,
                    6.2,
                    239
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/lWf1aiqDZqUbhrw8DnsfV8Ql7CP.jpg",
                    777350,
                    "en",
                    "Dory's Reef Cam",
                    "Dive into the waters below and watch the aquatic wildlife from the world of Nemo and Dory.",
                    817.707,
                    "/mMWLGu9pFymqipN8yvISHsAaj72.jpg",
                    "2020-12-18",
                    "Dory's Reef Cam",
                    false,
                    6.2,
                    27
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/jeAQdDX9nguP6YOX6QSWKDPkbBo.jpg",
                    590706,
                    "en",
                    "Jiu Jitsu",
                    "Every six years, an ancient order of jiu-jitsu fighters joins forces to battle a vicious race of alien invaders. But when a celebrated war hero goes down in defeat, the fate of the planet and mankind hangs in the balance.",
                    814.924,
                    "/eLT8Cu357VOwBVTitkmlDEg32Fs.jpg",
                    "2020-11-20",
                    "Jiu Jitsu",
                    false,
                    5.3,
                    251
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/4A0f1oqkJLohy8LXjmJpops7CMB.jpg",
                    8984,
                    "en",
                    "Disclosure",
                    "A computer specialist is sued for sexual harassment by a former lover turned boss who initiated the act forcefully, which threatens both his career and his personal life.",
                    639.605,
                    "/m10Sx3ikuXhJomFnN3OYpkBpYEc.jpg",
                    "1994-03-10",
                    "Disclosure",
                    false,
                    6.3,
                    767
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/8knaRrDd1FM1pbSLaViEQSxodi5.jpg",
                    441282,
                    "en",
                    "Night Hunter",
                    "A Minnesota police officer crosses paths with a committed and tireless vigilante as he follows the trail of a ruthless predator responsible for several abductions and murders.",
                    633.802,
                    "/vVYU0x9FRpiJNX7c54ciFnRBVYG.jpg",
                    "2019-08-29",
                    "Night Hunter",
                    false,
                    6.5,
                    428
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/qLL6H9SGEwRRW6PJHixyUtbBjBE.jpg",
                    716703,
                    "en",
                    "What Lies Below",
                    "Liberty, a socially awkward 16-year-old, returns from two months at camp to a blindsided introduction of her mother’s fiancé, John Smith, whose charm, intelligence, and beauty paint the picture of a man too perfect to be human.",
                    608.874,
                    "/zjGrlEuENSjRZGWc8N10zq3Jjkq.jpg",
                    "2020-12-17",
                    "What Lies Below",
                    false,
                    6.4,
                    17
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/lrzAb9QCwKPOwH1iY7WpfjR6jcC.jpg",
                    648371,
                    "en",
                    "No Good Deed",
                    "Karen never planned on being a hero. A recent widow, she has her hands full with work and parenting her son Max. Then Karen saves Jeremy's life during a drug store robbery and quickly discovers that the young man is intent on paying her back at any cost. At first, life starts improving for this good Samaritan, but as Jeremy's efforts become more extreme, Karen starts to wonder if no good deed truly goes unpunished.",
                    595.031,
                    "/27BnREBR5rcMrUVUhV5bTXlcCym.jpg",
                    "2020-03-13",
                    "No Good Deed",
                    false,
                    6.4,
                    29
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/sFLgXQGrSWxnjmPOpGKPApWNOUH.jpg",
                    635237,
                    "pt",
                    "Arthur & Merlin: Knights of Camelot",
                    "King Arthur returns home after fighting the Roman Empire. His illegitimate son has corrupted the throne of Camelot and King Arthur must reunite with the wizard Merlin and the Knights of the Round Table to fight to get back his crown.",
                    590.187,
                    "/chGTXsvn53XvEnvsJ9ZD9eiYKx9.jpg",
                    "2020-05-28",
                    "Arthur & Merlin: Knights of Camelot",
                    false,
                    5.3,
                    76
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/6hgItrYQEG33y0I7yP2SRl2ei4w.jpg",
                    613504,
                    "en",
                    "After We Collided",
                    "Tessa finds herself struggling with her complicated relationship with Hardin; she faces a dilemma that could change their lives forever.",
                    583.622,
                    "/kiX7UYfOpYrMFSAGbI6j1pFkLzQ.jpg",
                    "2020-09-02",
                    "After We Collided",
                    false,
                    7.3,
                    2897
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/d2UxKyaJ5GgzuHaSsWinFfv3g6L.jpg",
                    581392,
                    "ko",
                    "반도",
                    "A soldier and his team battle hordes of post-apocalyptic zombies in the wastelands of the Korean Peninsula.",
                    580.371,
                    "/sy6DvAu72kjoseZEjocnm2ZZ09i.jpg",
                    "2020-07-15",
                    "Peninsula",
                    false,
                    7.0,
                    1105
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/cw8A0SprTxr7uSfcH7lwSRRhezJ.jpg",
                    634244,
                    "en",
                    "Heavenquest: A Pilgrim's Progress",
                    "Inspired by the 1678 novel The Pilgrim's Progress and an imagined prequel to Bunyan's original writings.  A regal man named Vangel is thrust on a journey against his will when he is suddenly and mysteriously arrested.  Injured and lost after escaping the dark king’s men, Vangel begins to have strange dreams and visions of a mysterious woman in white calling him from the unknown territory of the North.  Armed with a book called “The Record of the Ancients” that he receives from a wise sage named Elder, Vangel embarks on an adventure that takes him through treacherous mountain range, unending deserts, the Lake of Doubts, and the Forest of No Return.  Along the way, travel companions share about a fabled good king and his son in the North if he can make it there alive.",
                    576.874,
                    "/cLDPLia17AwMqSaRHccyAlInkch.jpg",
                    "2020-07-13",
                    "Heavenquest: A Pilgrim's Progress",
                    false,
                    5.3,
                    40
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/h3dqQ1uqHsNwIVDufe9AzI7KgVS.jpg",
                    749618,
                    "es",
                    "El Camino de Xico",
                    "The peace of a small town is endangered when a corporation wants to destroy the mountain that protects them. A girl named Copi and her best friend Xico, a Xoloitzcuintle dog, will go into the mountains to try to save the town.",
                    553.029,
                    "/ssk0Gd27ziryP2OUxprIVhAvr3e.jpg",
                    "2020-11-12",
                    "Xico's Journey",
                    false,
                    6.9,
                    36
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/wKAidKCypwuxtZfZ4iP584PsWXV.jpg",
                    320846,
                    "en",
                    "Sky Sharks",
                    "A team of Arctic geologists stumble across an abandoned laboratory in which the Nazis developed an incredible and brutal secret weapon during the final months of WW2. Deep in the ice, they accidentally awake a deadly army of flying zombie sharks ridden by genetically mutated, undead super-humans, who are unleashed into the skies, wreaking their bloodthirsty revenge on any aircraft that takes to the air. An elite task force is assembled to take on this deadly threat and stop the Sky Sharks from conquering the air, but as time runs out, the task force realises they will have to fight fire with fire, and the stage is set for the greatest flying super-mutant zombie shark air battle the world has ever seen....",
                    552.126,
                    "/ne2xAzlgSaWvBrYGw2LkO8W5pHi.jpg",
                    "2020-10-07",
                    "Sky Sharks",
                    false,
                    4.7,
                    15
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/ckfwfLkl0CkafTasoRw5FILhZAS.jpg",
                    602211,
                    "en",
                    "Fatman",
                    "A rowdy, unorthodox Santa Claus is fighting to save his declining business. Meanwhile, Billy, a neglected and precocious 12 year old, hires a hit man to kill Santa after receiving a lump of coal in his stocking.",
                    548.482,
                    "/4n8QNNdk4BOX9Dslfbz5Dy6j1HK.jpg",
                    "2020-11-13",
                    "Fatman",
                    false,
                    5.5,
                    335
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/izNpxVcjKbF9BiYF4GVqxCOfewL.jpg",
                    641662,
                    "en",
                    "Pieces of a Woman",
                    "When a young mother's home birth ends in unfathomable tragedy, she begins a year-long odyssey of mourning that fractures relationships with loved ones in this deeply personal story of a woman learning to live alongside her loss.",
                    546.408,
                    "/OgUfLlhfBFx5BPK6LzBWFvBW1w.jpg",
                    "2020-12-30",
                    "Pieces of a Woman",
                    false,
                    7.1,
                    239
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/wu1uilmhM4TdluKi2ytfz8gidHf.jpg",
                    400160,
                    "en",
                    "The SpongeBob Movie: Sponge on the Run",
                    "When his best friend Gary is suddenly snatched away, SpongeBob takes Patrick on a madcap mission far beyond Bikini Bottom to save their pink-shelled pal.",
                    512.716,
                    "/jlJ8nDhMhCYJuzOw3f52CP1W8MW.jpg",
                    "2020-08-14",
                    "The SpongeBob Movie: Sponge on the Run",
                    false,
                    7.9,
                    1894
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/qUg005Yer0DQOW3l45jrwP0rTvo.jpg",
                    334521,
                    "en",
                    "Free Fire",
                    "A crime drama set in 1970s Boston, about a gun sale which goes wrong.",
                    503.614,
                    "/21WsmKivqOE2Vut73z07M8yx84F.jpg",
                    "2017-03-31",
                    "Free Fire",
                    false,
                    6.3,
                    747
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/zxHHmvUYlYhBuBmZpIrjnamCO3c.jpg",
                    505746,
                    "no",
                    "Børning 3",
                    "The third and final instalment in the Burnout trilogy. This time, the road leads trough Norway, to Sweden, Denmark and finally Germany to race on the famous racing track, Nürburgring.",
                    494.905,
                    "/f4xfU5BUrdDeOgt3J6drQGNjfZk.jpg",
                    "2020-10-14",
                    "Asphalt Burning",
                    false,
                    5.1,
                    53
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/xxEec408VQY7TIvtpxdkUM3Fux6.jpg",
                    773655,
                    "en",
                    "Death to 2020",
                    "2020: A year so [insert adjective of choice here], even the creators of Black Mirror couldn't make it up… but that doesn't mean they don't have a little something to add. This comedy event that tells the story of the dreadful year that was — and perhaps still is? The documentary-style special weaves together some of the world's most (fictitious) renowned voices with real-life archival footage.",
                    486.685,
                    "/w9FPFsPkeiBDn6WwDHFgniWdVJm.jpg",
                    "2020-12-27",
                    "Death to 2020",
                    false,
                    6.8,
                    301
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/2b2d6i3LZHRaGUwIGcw4h1Wecz6.jpg",
                    718022,
                    "en",
                    "Heks",
                    "A grieving British girl unravels her murdered mother's secrets connected to a South African witch doctor's curse. She wants to put an end to this haunting hex by traveling to South Africa, but instead it casts her deeper into sinister depths.",
                    482.478,
                    "/2b2d6i3LZHRaGUwIGcw4h1Wecz6.jpg",
                    "2020-12-15",
                    "Heks",
                    false,
                    3.5,
                    2
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/umrpNeJooAyfvgPuOutNQHZdJ2p.jpg",
                    652962,
                    "en",
                    "Half Brothers",
                    "A story about the complex connection with a brother who is based in Mexico, meant to be a metaphor of the relationship between neighboring countries America and Mexico.",
                    482.334,
                    "/Apl0WFx61trVOoxvc8Erd5cbP8X.jpg",
                    "2020-12-04",
                    "Half Brothers",
                    false,
                    7.8,
                    64
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/8rIoyM6zYXJNjzGseT3MRusMPWl.jpg",
                    531219,
                    "en",
                    "Roald Dahl's The Witches",
                    "In late 1967, a young orphaned boy goes to live with his loving grandma in the rural Alabama town of Demopolis. As the boy and his grandmother encounter some deceptively glamorous but thoroughly diabolical witches, she wisely whisks him away to a seaside resort. Regrettably, they arrive at precisely the same time that the world's Grand High Witch has gathered.",
                    470.418,
                    "/b1C0FuXp4wiPmHLVKq4kwtDMgK6.jpg",
                    "2020-10-25",
                    "Roald Dahl's The Witches",
                    false,
                    6.8,
                    1137
                )
            )
            movies.add(
                MovieResponse(
                    false,
                    "/zMcEalkxEiRjvmijliLBk0sYern.jpg",
                    765123,
                    "de",
                    "Wir Können Nicht Anders",
                    "A man foils an attempted murder, then flees the crew of would-be killers along with their intended target as a woman he's just met tries to find him.",
                    466.487,
                    "/ajKpYK7XdzIYjy9Uy8nkgRboKyv.jpg",
                    "2020-12-04",
                    "Christmas Crossfire",
                    false,
                    4.6,
                    47
                )
            )
            return movies
        }

        fun generateRemoteDummyTvShow(): List<TvResponse> {
            val tvShow = arrayListOf<TvResponse>()

            tvShow.add(
                TvResponse(
                    "/gL8myjGc2qrmqVosyGm5CWTir9A.jpg",
                    77169,
                    "en",
                    "This Karate Kid sequel series picks up 30 years after the events of the 1984 All Valley Karate Tournament and finds Johnny Lawrence on the hunt for redemption by reopening the infamous Cobra Kai karate dojo. This reignites his old rivalry with the successful Daniel LaRusso, who has been working to maintain the balance in his life without mentor Mr. Miyagi.",
                    1179.939,
                    "/obLBdhLxheKg8Li1qO11r2SwmYO.jpg",
                    8.1,
                    1779,
                    "2018-05-02",
                    "Cobra Kai",
                    "Cobra Kai"
                )
            )
            tvShow.add(
                TvResponse(
                    "/o7qi2v4uWQ8bZ1tW3KI0Ztn2epk.jpg",
                    82856,
                    "en",
                    "After the fall of the Galactic Empire, lawlessness has spread throughout the galaxy. A lone gunfighter makes his way through the outer reaches, earning his keep as a bounty hunter.",
                    1050.47,
                    "/sWgBv7LV2PRoQgkxwlibdGXKz1S.jpg",
                    8.5,
                    5184,
                    "2019-11-12",
                    "The Mandalorian",
                    "The Mandalorian"
                )
            )
            tvShow.add(
                TvResponse(
                    "/aq2yEMgRQBPfRkrO0Repo2qhUAT.jpg",
                    44217,
                    "en",
                    "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                    935.804,
                    "/bQLrHIRNEkE3PdIWQrZHynQZazu.jpg",
                    8.0,
                    3814,
                    "2013-03-03",
                    "Vikings",
                    "Vikings"
                )
            )
            tvShow.add(
                TvResponse(
                    "/lbWUCXIeoVXowAtLlAVR3aeHjkT.jpg",
                    96677,
                    "fr",
                    "Inspired by the adventures of Arsène Lupin, gentleman thief Assane Diop sets out to avenge his father for an injustice inflicted by a wealthy family.",
                    926.506,
                    "/sgxawbFB5Vi5OkPWQLNfl3dvkNJ.jpg",
                    8.1,
                    212,
                    "2021-01-08",
                    "Lupin",
                    "Lupin"
                )
            )
            tvShow.add(
                TvResponse(
                    "/mZjZgY6ObiKtVuKVDrnS9VnuNlE.jpg",
                    71712,
                    "en",
                    "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                    892.967,
                    "/6tfT03sGp9k4c0J3dypjrI8TSAI.jpg",
                    8.6,
                    6404,
                    "2017-09-25",
                    "The Good Doctor",
                    "The Good Doctor"
                )
            )
            tvShow.add(
                TvResponse(
                    "/8AdmUPTyidDebwIuakqkSt6u1II.jpg",
                    79242,
                    "en",
                    "As her 16th birthday nears, Sabrina must choose between the witch world of her family and the human world of her friends. Based on the Archie comic.",
                    738.329,
                    "/yxMpoHO0CXP5o9gB7IfsciilQS4.jpg",
                    8.4,
                    2123,
                    "2018-10-26",
                    "Chilling Adventures of Sabrina",
                    "Chilling Adventures of Sabrina"
                )
            )
            tvShow.add(
                TvResponse(
                    "/lOr9NKxh4vMweufMOUDJjJhCRHW.jpg",
                    85271,
                    "en",
                    "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                    717.654,
                    "/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                    8.5,
                    1000,
                    "2021-01-15",
                    "WandaVision",
                    "WandaVision"
                )
            )
            tvShow.add(
                TvResponse(
                    "/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
                    1416,
                    "en",
                    "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                    710.281,
                    "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                    8.2,
                    4962,
                    "2005-03-27",
                    "Grey's Anatomy",
                    "Grey's Anatomy"
                )
            )
            tvShow.add(
                TvResponse(
                    "/9hvhGtcsGhQY58pukw8w55UEUbL.jpg",
                    69050,
                    "en",
                    "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of real small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                    693.754,
                    "/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg",
                    8.6,
                    7715,
                    "2017-01-26",
                    "Riverdale",
                    "Riverdale"
                )
            )
            tvShow.add(
                TvResponse(
                    "/m7FqiUOvsSk7Ulg2oRMfFGcLeT9.jpg",
                    91239,
                    "en",
                    "Wealth, lust, and betrayal set in the backdrop of Regency era England, seen through the eyes of the powerful Bridgerton family.",
                    642.541,
                    "/qaewZKBKmXjb4ZfFBb1LCug6BE8.jpg",
                    8.3,
                    421,
                    "2020-12-25",
                    "Bridgerton",
                    "Bridgerton"
                )
            )
            tvShow.add(
                TvResponse(
                    "/b7MUOLzo9kxQRSjGHwp589HMdxI.jpg",
                    86382,
                    "en",
                    "In a world mostly wiped out by the plague and embroiled in an elemental struggle between good and evil, the fate of mankind rests on the frail shoulders of the 108-year-old Mother Abagail and a handful of survivors. Their worst nightmares are embodied in a man with a lethal smile and unspeakable powers: Randall Flagg, the Dark Man.",
                    642.48,
                    "/w6XiuRK5QQaLNmIqDRCWOpEcHwi.jpg",
                    7.2,
                    116,
                    "2020-12-17",
                    "The Stand",
                    "The Stand"
                )
            )
            tvShow.add(
                TvResponse(
                    "/mE3zzMkpP8yqlkzdjPsQmJHceoe.jpg",
                    75006,
                    "en",
                    "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                    580.606,
                    "/scZlQQYnDVlnpxFTxaIv2g0BWnL.jpg",
                    8.7,
                    5390,
                    "2019-02-15",
                    "The Umbrella Academy",
                    "The Umbrella Academy"
                )
            )
            tvShow.add(
                TvResponse(
                    "/bKxiLRPVWe2nZXCzt6JPr5HNWYm.jpg",
                    110316,
                    "ja",
                    "With his two friends, a video-game-obsessed young man finds himself in a strange version of Tokyo where they must compete in dangerous games to win.",
                    561.723,
                    "/20mOwAAPwZ1vLQkw0fvuQHiG7bO.jpg",
                    8.3,
                    103,
                    "2020-12-10",
                    "Alice in Borderland",
                    "今際の国のアリス"
                )
            )
            tvShow.add(
                TvResponse(
                    "/ta5oblpMlEcIPIS2YGcq9XEkWK2.jpg",
                    63174,
                    "en",
                    "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                    552.654,
                    "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                    8.5,
                    7115,
                    "2016-01-25",
                    "Lucifer",
                    "Lucifer"
                )
            )
            tvShow.add(
                TvResponse(
                    "/lthkKBLe1rX6iThgVFg22O02sJw.jpg",
                    95479,
                    "ja",
                    "Yuuji Itadori is a boy with tremendous physical strength, though he lives a completely ordinary high school life. One day, to save a friend who has been attacked by Curses, he eats a finger of Ryoumen Sukuna, taking the Curse into his own soul. From then on, he shares one body with Sukuna. Guided by the most powerful of sorcerers, Satoru Gojou, Itadori is admitted to the Tokyo Prefectural Jujutsu High School, an organization that fights the Curses... and thus begins the heroic tale of a boy who became a Curse to exorcise a Curse, a life from which he could never turn back.",
                    509.29,
                    "/g1rK2nRXSidcMwNliWDIroWWGTn.jpg",
                    8.7,
                    391,
                    "2020-10-03",
                    "Jujutsu Kaisen",
                    "呪術廻戦"
                )
            )
            tvShow.add(
                TvResponse(
                    "/y4Ia5VeYMWKFMk04lrOXkHrzwTt.jpg",
                    111499,
                    "es",
                    "In a contemporary Mexico City, a group of six sophisticated close friends navigate through every life experience imaginable together: love, lies, heartbreak, marriage, divorce, kids, career, job loss, fights, break-ups, and unbreakable friendships.",
                    479.932,
                    "/xYsNIxKD7JTg3hi03U2TlBFTGKI.jpg",
                    8.1,
                    244,
                    "2020-06-11",
                    "De brutas, nada",
                    "De brutas, nada"
                )
            )
            tvShow.add(
                TvResponse(
                    "/suopoADq0k8YZr4dQXcU6pToj6s.jpg",
                    1399,
                    "en",
                    "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                    367.076,
                    "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                    8.4,
                    12323,
                    "2011-04-17",
                    "Game of Thrones",
                    "Game of Thrones"
                )
            )
            tvShow.add(
                TvResponse(
                    "/uSvncE20Mh3seJLIHLEQnt0OcBv.jpg",
                    89844,
                    "es",
                    "Father Vergara—an exorcist, boxer and ex-convict—lives in a remote village in Spain. Hoping to be lost and forgotten, Vergara’s demons catch up to him.",
                    357.774,
                    "/b2i9aaV6ncULl9jYXEoPi7VFJg8.jpg",
                    6.8,
                    186,
                    "2020-11-29",
                    "30 Coins",
                    "30 Monedas"
                )
            )
            tvShow.add(
                TvResponse(
                    "/k7T9xRyzP41wBVNyNeLmh8Ch7gD.jpg",
                    18165,
                    "en",
                    "The story of two vampire brothers obsessed with the same girl, who bears a striking resemblance to the beautiful but ruthless vampire they knew and loved in 1864.",
                    356.999,
                    "/aBkVgChtyyJaHyZh1gfd8DbzQon.jpg",
                    8.3,
                    4803,
                    "2009-09-10",
                    "The Vampire Diaries",
                    "The Vampire Diaries"
                )
            )
            tvShow.add(
                TvResponse(
                    "/1IO3hNWCeGStVuCopf6bJnazWyz.jpg",
                    113600,
                    "da",
                    "Haunted by visions after her sister vanished with her classmates 21 years before, Astrid begins an investigation that uncovers the dark, eerie truth.",
                    355.491,
                    "/bnU3Rz3nR844WZNOyrCk8W52DUs.jpg",
                    7.7,
                    103,
                    "2020-12-30",
                    "Equinox",
                    "Equinox"
                )
            )
            tvShow.add(
                TvResponse(
                    "/9PaJZrGW5qYXfSVJYAmKIEEQMdH.jpg",
                    96648,
                    "ko",
                    "Cha Hyun-Soo is a high school student. He is also a recluse and rarely leaves his room. He refuses to talk to his father, mother and younger sister. One day, his whole family, except for him, dies in a car accident. Cha Hyun-Soo is left all alone. He moves into a small apartment. At this time, a mysterious phenomenon of humans turning into monster occur all around the world. The residents of Cha Hyun-Soo's apartment building, including Pyeon Sang-Wook, fight against these monsters and try to survive.",
                    341.449,
                    "/6eMg81CPLalULg8spPt2LxfQtFj.jpg",
                    8.6,
                    281,
                    "2020-12-18",
                    "Sweet Home",
                    "스위트홈"
                )
            )
            tvShow.add(
                TvResponse(
                    "/34OGjFEbHj0E3lE2w0iTUVq0CBz.jpg",
                    87739,
                    "en",
                    "In a Kentucky orphanage in the 1950s, a young girl discovers an astonishing talent for chess while struggling with addiction.",
                    336.74,
                    "/zU0htwkhNvBQdVSIKB9s6hgVeFK.jpg",
                    8.7,
                    1276,
                    "2020-10-23",
                    "The Queen's Gambit",
                    "The Queen's Gambit"
                )
            )
            tvShow.add(
                TvResponse(
                    "/hpU2cHC9tk90hswCFEpf5AtbqoL.jpg",
                    456,
                    "en",
                    "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                    336.526,
                    "/2IWouZK4gkgHhJa3oyYuSWfSqbG.jpg",
                    7.8,
                    5779,
                    "1989-12-16",
                    "The Simpsons",
                    "The Simpsons"
                )
            )
            tvShow.add(
                TvResponse(
                    "/hTExot1sfn7dHZjGrk0Aiwpntxt.jpg",
                    48866,
                    "en",
                    "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
                    329.483,
                    "/wcaDIAG1QdXQLRaj4vC1EFdBT2.jpg",
                    7.8,
                    5453,
                    "2014-03-19",
                    "The 100",
                    "The 100"
                )
            )
            tvShow.add(
                TvResponse(
                    "/rgBxEVr44C00hBg3jLicxWMy9yy.jpg",
                    113367,
                    "en",
                    "A group of teen girls from different backgrounds must fight for survival after a plane crash strands them on a deserted island. The castaways both clash and bond as they learn more about each other, the secrets they keep, and the traumas they've all endured. But there’s just one twist… these girls did not end up on this island by accident.",
                    329.309,
                    "/gHBtyMdHbWoM3tpM8VZymer8HfF.jpg",
                    8.0,
                    115,
                    "2020-12-11",
                    "The Wilds",
                    "The Wilds"
                )
            )
            tvShow.add(
                TvResponse(
                    "/oycArCLGgtWyUz5aho7ojFZkgjN.jpg",
                    46260,
                    "ja",
                    "In another world, ninja are the ultimate power, and in the Village Hidden in the Leaves live the stealthiest ninja in the land. Twelve years earlier, the fearsome Nine-Tailed Fox terrorized the village and claimed many lives before it was subdued and its spirit sealed within the body of a baby boy. That boy, Naruto Uzumaki, has grown up to become a ninja-in-training who's more interested in pranks than in studying ninjutsu.. but Naruto is determined to become the greatest ninja ever!",
                    329.234,
                    "/vauCEnR7CiyBDzRCeElKkCaXIYu.jpg",
                    8.4,
                    2896,
                    "2002-10-03",
                    "Naruto",
                    "ナルト"
                )
            )
            tvShow.add(
                TvResponse(
                    "/mGVrXeIjyecj6TKmwPVpHlscEmw.jpg",
                    76479,
                    "en",
                    "A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",
                    328.572,
                    "/mY7SeH4HFFxW1hiI6cWuwCRKptN.jpg",
                    8.5,
                    3926,
                    "2019-07-25",
                    "The Boys",
                    "The Boys"
                )
            )
            tvShow.add(
                TvResponse(
                    "/3Ehu0zk1XLvt5SfcRjZDcKbmFac.jpg",
                    94167,
                    "es",
                    "The story of Rodrigo Díaz de Vivar, a Castilian nobleman and war hero in medieval Spain.",
                    326.101,
                    "/jTDpdYASFxX45GWkGPHmS74BNvz.jpg",
                    6.9,
                    48,
                    "2020-12-18",
                    "El Cid",
                    "El Cid"
                )
            )
            tvShow.add(
                TvResponse(
                    "/qsTlD6rYb5vXOlBTT9Lj2hBp44X.jpg",
                    44953,
                    "es",
                    "Set in the 1990s, these are the life and times of Amado Carrillo Fuentes, a man who became the head of the Juárez cartel. Nicknamed “El Señor de los Cielos” (Lord of the Skies) because of the large fleet of airplanes he used to transport drugs, he was also known for washing more than $200 million through Colombia to finance his huge fleet. He is described as the most powerful drug trafficker of his time.",
                    317.101,
                    "/Ag7VUdnrRz5Qpq3Yn3E5OCvFnu0.jpg",
                    7.7,
                    904,
                    "2013-04-15",
                    "The Lord of the Skies",
                    "El señor de los cielos"
                )
            )
            tvShow.add(
                TvResponse(
                    "/92B6765nyQkIW8yLWt3pNcS6Cip.jpg",
                    62286,
                    "en",
                    "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                    316.711,
                    "/wGFUewXPeMErCe2xnCmmLEiHOGh.jpg",
                    7.5,
                    2999,
                    "2015-08-23",
                    "Fear the Walking Dead",
                    "Fear the Walking Dead"
                )
            )
            tvShow.add(
                TvResponse(
                    "/wgEWTYAAY7F04o4F20j0L1DGB8i.jpg",
                    91605,
                    "en",
                    "Each hour-long film follows a different women as they experience “moments that are emotionally raw, thought-provoking and utterly personal”.",
                    315.086,
                    "/oogunE22HDTcTxFakKQbwqfw1qo.jpg",
                    5.6,
                    11,
                    "2019-07-23",
                    "I Am...",
                    "I Am..."
                )
            )
            tvShow.add(
                TvResponse(
                    "/8FDb3FUNGEeiPmHG00Onlu6xVnE.jpg",
                    94413,
                    "es",
                    "A teacher starts her job at a high school but is haunted by a suspicious death that occurred there weeks before and begins fearing for her own life.",
                    307.604,
                    "/lO3JkTPko8kEr2luYGwQocU1lJH.jpg",
                    5.1,
                    15,
                    "2020-12-11",
                    "The Mess You Leave Behind",
                    "El desorden que dejas"
                )
            )
            tvShow.add(
                TvResponse(
                    "/Wu8kh7oyvaIfkNyMJyJHCamh5L.jpg",
                    97180,
                    "en",
                    "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                    306.455,
                    "/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg",
                    7.5,
                    934,
                    "2020-12-04",
                    "Selena: The Series",
                    "Selena: The Series"
                )
            )
            tvShow.add(
                TvResponse(
                    "/wXXaPMgrv96NkH8KD1TMdS2d7iq.jpg",
                    1402,
                    "en",
                    "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                    293.431,
                    "/qgjP2OrrX9gc6M270xdPnEmE9tC.jpg",
                    8.0,
                    9308,
                    "2010-10-31",
                    "The Walking Dead",
                    "The Walking Dead"
                )
            )
            tvShow.add(
                TvResponse(
                    "/jC1KqsFx8ZyqJyQa2Ohi7xgL7XC.jpg",
                    60735,
                    "en",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                    291.925,
                    "/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg",
                    7.6,
                    6524,
                    "2014-10-07",
                    "The Flash",
                    "The Flash"
                )
            )
            tvShow.add(
                TvResponse(
                    "/1qOA3kMtQO8bjnW8M2smjA8tp10.jpg",
                    76669,
                    "es",
                    "When three working class kids enroll in the most exclusive school in Spain, the clash between the wealthy and the poor students leads to tragedy.",
                    287.106,
                    "/3NTAbAiao4JLzFQw6YxP1YZppM8.jpg",
                    8.3,
                    5694,
                    "2018-10-05",
                    "Elite",
                    "Élite"
                )
            )
            tvShow.add(
                TvResponse(
                    "/56v2KjBlU4XaOv9rVYEQypROD7P.jpg",
                    66732,
                    "en",
                    "When a young boy vanishes, a small town uncovers a mystery involving secret experiments, terrifying supernatural forces, and one strange little girl.",
                    286.136,
                    "/x2LSRK2Cm7MZhjluni1msVJ3wDF.jpg",
                    8.6,
                    7163,
                    "2016-07-15",
                    "Stranger Things",
                    "Stranger Things"
                )
            )
            tvShow.add(
                TvResponse(
                    "/iCBMJZFsdXALgpS121qu4CAe2Sa.jpg",
                    71789,
                    "en",
                    "The lives of the elite Navy Seals as they train, plan and execute the most dangerous, high-stakes missions our country can ask.",
                    278.844,
                    "/uTSLeQTeHevt4fplegmQ6bOnE0Z.jpg",
                    7.8,
                    799,
                    "2017-09-27",
                    "SEAL Team",
                    "SEAL Team"
                )
            )
            tvShow.add(
                TvResponse(
                    "/oAkpvVvoyZWMo9cpNk3aQoVKsjM.jpg",
                    67335,
                    "es",
                    "A young woman born in a mafia-controlled town seeks revenge on those who wrongfully harmed and imprisoned her family.",
                    278.177,
                    "/ulcGG2JKjbVMQFIux1vcQGN1pQi.jpg",
                    7.5,
                    1731,
                    "2016-07-19",
                    "Sin senos sí hay paraíso",
                    "Sin senos sí hay paraíso"
                )
            )
            tvShow.add(
                TvResponse(
                    "/kuOt3LxmHW8k39SK2tyg6qSWhop.jpg",
                    4604,
                    "en",
                    "The origins of the world’s greatest hero–from Krypton refugee Kal-el’s arrival on Earth through his tumultuous teen years to Clark Kent’s final steps toward embracing his destiny as the Man of Steel.",
                    272.316,
                    "/pUhJGETy2sec4vEkiqJ9eGeIywc.jpg",
                    8.1,
                    1986,
                    "2001-10-16",
                    "Smallville",
                    "Smallville"
                )
            )

            return tvShow
        }

        fun generateRemoteDummyMovieDetail(movieId: Int): MovieResponse {
            var retData: MovieResponse? = null
            generateRemoteDummyMovie().forEach { movieResponse ->
                if (movieId == movieResponse.id) retData = movieResponse
            }
            return retData as MovieResponse
        }

        fun generateRemoteDummyTvShowDetail(tvId: Int): TvResponse {
            var retData: TvResponse? = null
            generateRemoteDummyTvShow().forEach { tvResponse ->
                if (tvId == tvResponse.id) retData = tvResponse
            }
            return retData as TvResponse
        }
    }
}