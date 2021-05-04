package googol;

import static googol.BinomialExpansion.Formula;
import static googol.Calculator.Operation;
import static googol.Guess.convert;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GoogolMain{
    	
    public static void main(String[] input) 
    {
        
       
        Scanner sc = new Scanner(System.in);
        String search=null;
        String line = null;
        try
        {
            /* FileReader reads the text files in the default encoding */
            FileReader fileReader = new FileReader("C://Users/imran/My Project/Googol/top-1m.csv");
            
            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            System.out.println("Welcome to Googol");
             search = sc.nextLine();
            
            String[] shopping = {"www.amazon.com", "www.lazada.com", "www.11street.com", "Clips4sale.com", "Adultdvdempire.com", "Adultdvdtalk.com", "Aventertainments.com", "Gamelink.com", "Adameve.com", "Jlist.com", "Fleshlight.com", "Edenfantasys.com", "Inthecrack.com", "Belamionline.com", "Tlavideo.com", "Digitalplayground.com", "Williamhiggins.com", "Falconstudios.com", "Jadedvideo.com", "Adultemart.com", "Annsummers.com", "Taschen.com", "Lucasentertainment.com", "Pinkcherry.com", "Extremerestraints.com", "Liberator.com", "Mr-s-leather.com", "Goodvibes.com", "Tootimid.com", "Stockroom.com", "Dofantasy.com", "Honour.co.uk", "Bestvibes.ca", "Lingeriediva.com", "Babeland.com", "Loverslane.com", "Lovedreamer.com", "Tabutoys.com", "Hothouse.com", "Adultdvdmarketplace.com", "Realdoll.com", "Uberkinky.co.uk", "Stagshop.com", "Moreystudio.com", "Romanticdepot.com", "Evastoys.eu", "Asianscreens.com", "Blissbox.com", "Wickedtemptations.com", "Rainbowdepot.com", "Excaliburfilms.com", "Dubiobikinis.com", "Sportsheets.com", "ebay.com", "myshopify.com"};
            String[] art = {"Nhentai.net", "Furaffinity.net", "Literotica.com", "Iafd.com", "Hentai2read.com", "Hentai-foundry.com", "Oglaf.com", "Luscious.net", "F-list.net", "Nifty.org", "Inkbunny.net", "Asstr.org", "Buttsmithy.com", "Fakku.net", "Sofurry.com", "Tgcomics.com", "Jlist.com", "Asexstories.com", "Weasyl.com", "Joerogan.net", "Lushstories.com", "Mcstories.com", "Awal.com", "Roccosiffredi.com", "Indiansexstories.net", "Sexstoriespost.com", "Hentairules.net", "Renderotica.com", "Ma3comic.com", "Somethingpositive.net", "Tthfanfic.", "Wtfpeople.com", "Bdsmlibrary.com", "Jabarchives.com", "Jabcomix.com", "Zizki.com", "Eroticillusions.com", "Hentaihere.com", "Clubsissy.com", "Upcomics.org", "Jastusa.com", "Smutjunkies.com", "Fantasies.com", "Eunuch.org", "Dougstanhope.com", "Lustomic.com", "Peternorth.com", "Booklocker.com", "Furfling.com", "Eroticstories.com"};
            String[] adult = {"Xvideos.com", "Xnxx.com", "Chaturbate.com", "Livejasmin.com", "Youporn.com", "Bongacams.com", "4chan.org", "Cam4.com", "Nhenti.net", "Adultfriendfinder.com", "Porn.com", "Fetlife.com", "Spankwire.com", "Clips4sale.com", "Liveleak.com", "Furaffinity.net", "Literotica.com", "Planetsuzy.org", "Nudevista.com", "Ebaumsworld.com", "Iafd.com", "Adam4adam.com", "Hentai2read.com", "Mrporngeek.com", "Freeones.com", "Mrskin.com", "Hentai-foundry.com", "Oglaf.com", "Cams.com", "Adultdvdempire.com", "Gfy.com", "Luscious.net", "Fux.com", "Streamate.com", "Vintage-erotica-forum.com", "Gayboystube.com", "Flirt4free.com", "Fling.com", "Squirt.org", "F-list.net", "Imlive.com", "Manhunt.net", "Nifty.org", "Voyeurweb.com", "Ftvgirls.com", "Inkbunny.net", "Adultdvdtalk.com", "Eros.com", "Faapy.com", "Swinglifestyle.com"};
            String[] business = {"Office.com", "Espn.com", "Paypal.com", "Indeed.com", "Chase.com", "Alibaba.com", "Shutterstock.com", "Scribd.com", "Forbes.com", "Zillow.com", "Hdfcbank.com", "Businessinsider.com", "Finance.yahoo.com", "Wellsfargo.com", "Capitalone.com", "Icicibank.com", "Skype.com", "Target.com", "Ups.com", "Behance.net", "Americanexpress.com", "Samsung.com", "Investing.com", "Fedex.com", "Economictimes.indiatimes.com", "Eventbrite.com", "Bloomberg.com", "Adp.com", "Springer.com", "Investopedia.com", "Bankofamerica.com", "Reuters.com", "Td.com", "Hm.com", "Wsj.com", "Merriam-webster.com", "Realtor.com", "Costco.com", "Att.com", "Wiley.com", "Istockphoto.com", "Marketwatch.com", "Nypost.com", "Verizonwireless.com", "Fidelity.com", "Onlinelibrary.wiley.com", "Freelancer.com", "Zara.com", "123rf.com", "Discover.com", "Alibaba.com", "Fastcompany.com", "Globalsources.com", "Digitalriver.com", "Wipro.com", "Ariba.com", "Gobizkorea.com", "Ioffer.com", "Wbresearch.com", "Bullhorn.com", "Highrisehq.com", "Csc.com", "Sugarcrm.com", "Gs1.org,Sapient.com", "Ecommercebytes.com", "Spscommerce.com", "Knowledge.wharton.upenn.edu", "Ad-tech.com", "Ironplanet.com", "Webmonkey.com", "Buyerzone.com", "Digitas.com", "Itelligencegroup.com", "Ecommercetimes.com", "Nexternal.com", "Westmonroepartners.com", "It4profit.com", "Arinet.com", "Manufacturing.net", "Pubcon.com", "Esellercafe.com", "Xoriant.com", "Enigma.com", "Squiz.net", "Rockanddirt.com", "1edisource.com", "Netx.net", "Descartes.com", "Cygnet-infotech.com", "Planetecomsolutions.com", "Trinityinsight.com", "Egain.com", "Denverdata.com", "Crmbuyer.com", "Covalentworks.com", "Goizueta.emory.edu", "Ecommercepartners.net", "Pixelplanet.com", "Dataart.com"};
            String[] computer = {"Google.com", "Youtube.com", "Mail.google.com", "Docs.google.com", "Facebook.com", "Yahoo.com", "En.wikipedia.org", "Search.yahoo.com", "Office.com", "Bing.com", "Microsoft.com", "Twitter.com", "Stackoverflow.com", "Mail.yahoo.com", "Apple.com", "Linkedin.com", "Dropbox.com", "Play.google.com", "Tumblr.com", "Imgur.com", "Paypal.com", "Soundcloud.com", "Salesforce.com", "Cnet.com", "Slideshare.net", "Wikihow.com", "Pinterest.com", "Fiverr.com", "Aws.amazon.com", "Godaddy.com", "Archive.org", "Mediafire.com", "Trello.com", "Zendesk.com", "Vimeo.com", "Scribd.com", "Duckduckgo.com", "Ask.com", "Speedtest.net", "Pixabay.com", "Ilovepdf.com", "Blogger.com", "Support.microsoft.com", "Smallpdf.com", "Mozilla.org", "Intuit.com", "Github.com", "Mozilla.org", "Sourceforge.net", "Apache.org", "Notepad-plus-plus.org", "Slashdot.org", "Launchpad.net", "Addons.mozilla.org", "About.gitlab.com", "Portableapps.com", "Nginx.org", "Codeplex.com", "Musescore.org", "Curl.haxx.se", "Transifex.com", "Linuxfoundation.org", "Zabbix.com", "Mozillazine.org", "Bugzilla.mozilla.org", "Mozdev.org", "Phplist.com", "Poedit.net", "Postfix.org", "Opensource.org", "Blog.mozilla.org", "Osdir.com", "Lmms.io", "Fsf.org", "Dbpedia.org", "Modx.com", "Wikimediafoundation.org", "Mixxx.org", "Gnuwin32.sourceforge.net", "Xmpp.org", "Thefullwiki.org", "Everything2.com", "Fsfe.org", "Findbestopensource.com", "Mantisbt.org", "Linuxtoday.com", "Xiph.org", "Sphinxsearch.com", "I4u.com", "Wesnoth.org", "Userfriendly.org", "Boinc.berkeley.edu", "Ubuntustudio.org", "Softpanorama.org", "Directory.fsf.org"};
            String[] game = {"Twitch.tv", "Roblox.com", "Store.steampowered.com", "Wowhead.com", "Chess.com", "Ign.com", "Gamespot.com", "Playstation.com", "Leagueoflegends.com", "Epicgames.com", "Battle.net", "Ea.com", "Blizzard.com", "Nvidia.com", "Xbox.com", "Pcgamer.com", "Nexusmods.com", "Minecraft.net", "Rockstargames.com", "Gamesradar.com", "Nintendo.com", "Bulbagarden.net", "Vocabulary.com", "Itch.io", "Unity3d.com", "Easports.com", "Wizards.com", "Sporcle.com", "Callofduty.com", "Kongregate.com", "Boardgamegeek.com", "Eurogamer.net", "Icy-veins.com", "Miniclip.com", "Ubisoft.com", "Bungie.net", "Betfair.com", "Pch.com", "Pokemon.com", "Finalfantasyxiv.com", "Activision.com", "Square-enix.com", "Mmo-champion.com", "Mtggoldfish.com", "Thesimsresource.com", "Planetminecraft.com", "Travian.com", "Rockpapershotgun.com", "Hattrick.org", "Covers.com"};
            String[] reference = {"Stackoverflow.com", "Udemy.com", "Nlm.nih.gov", "Archive.org", "Thesaurus.com", "Goodreads.com", "Blackboard.com", "Wordreference.com", "Cambridge.org", "Mit.edu", "Dictionary.cambridge.org", "Investopedia.com", "Merriam-webster.com", "Elsevier.com", "Britannica.com", "Wiktionary.org", "Coursera.org", "Spanishdict.com", "Thefreedictionary.com", "Harvard.edu", "Urbandictionary.com", "Ed.gov", "Answers.yahoo.com", "Turnitin.com", "Thoughtco.com", "Stanford.edu", "Yourdictionary.com", "Collegeboard.org", "Edx.org", "Purdue.edu", "Oup.com", "Psu.edu", "En.wiktionary.org", "Ecollege.com", "Citationmachine.net", "Answers.com", "Berkeley.edu", "Ebscohost.com", "Howstuffworks.com", "Linguee.com", "Whitepages.com", "Cornell.edu", "Dict.cc", "Mapquest.com", "Columbia.edu", "Brainyquote.com", "Faradars.org", "Nyu.edu", "Dict.leo.org", "Wisc.edu", "Mindmeister.com", "Tableau.com", "Worldcat.org", "Stumbleupon.com", "Toolbox.com", "Lumosity.com", "Nngroup.com", "Processing.org", "Xmind.net", "Smarttech.com", "Mindjet.com", "Canto.com", "Iperceptions.com", "Cspace.com", "Ics.forth.gr", "Hbswk.hbs.edu", "Mind42.com", "Gephi.org", "Freemind.sourceforge.net", "Jmp.com", "Biggerplate.com", "Cmap.ihmc.us", "Thebrain.com", "Imindq.com", "Klariti.com", "Supermemo.com", "Kmworld.com", "Inspiration.com", "Tgs.com", "Creativityatwork.com", "Adaptive.com", "Knowledgebase-script.com", "Mindmappingsoftwareblog.com", "Boxesandarrows.com", "Targit.com", "Dalet.com", "Datawatch.com", "Silvercloudinc.com", "Semantic-web-journal.net", "Vanguardsw.com", "Informationr.net", "Ontotext.com", "Vtk.org", "Freeplane.org", "Kdd.ics.uci.edu", "Axismaps.com", "Mnemosyne-proj.org", "Datavisualization.ch", "Perceptualedge.com"};
            String[] regional = {"Google.com", "Yahoo.com", "Amazon.com", "Microsoft.com", "Amazon.co.jp", "Apple.com", "Adobe.com", "Nytimes.com", "Walmart.com", "Chase.com", "Theguardian.com", "Alibaba.com", "Flipkart.com", "Indiatimes.com", "Google.co.uk", "Bestbuy.com", "Nlm.nih.gov", "Bet365.com", "Amazon.ca", "Zillow.com", "Ebay.co.uk", "Wellsfargo.com", "Asos.com", "Ikea.com", "Dailymail.co.uk", "Weather.com", "Tripadvisor.com", "Icicibank.com", "Ndtv.com", "Target.com", "Ups.com", "Usps.com", "Americanexpress.com", "Homedepot.com", "Samsung.com", "Cambridge.org", "Fedex.com", "Google.com.au", "Hp.com", "Economictimes.indiatimes.com", "Irctc.co.in", "Rt.com", "Xfinity.com", "Naukri.com", "Aol.com", "State.gov"};
            String[] science = {"Translate.google.com", "Researchgate.net", "Ncbi.nlm.nih.gov", "Sciencedirect.com", "Reverso.net", "Coinmarketcap.com", "Elsevier.com", "Duolingo.com", "Timeanddate.com", "Autodesk.com", "Mayoclinic.org", "Urbandictionary.com", "Jstor.org,Ted.com", "Nature.com", "Ieee.org,Weather.gov", "Mathworks.com", "Symbolab.com", "Berkeley.edu", "Arxiv.org", "Howstuffworks.com", "Noaa.gov", "Nationalgeographic.com", "Fao.org", "Acs.org", "Livescience.com", "Colorado.edu", "Calculatorsoup.com", "Desmos.com", "Biomedcentral.com", "Economist.com", "Sciencedaily.com", "Bom.gov.au", "Usgs.gov", "Mdpi.com", "Rsc.org", "Usda.gov", "Hindawi.com", "Frontiersin.org", "Sciencemag.org", "Hse.ru", "Apa.org", "He.wikipedia.org", "Nps.gov", "Italki.com", "Plos.org", "Jma.go.jp", "Scientificamerican.com", "Space.com"};
            String[] society = {"Nih.gov", "Patreon.com", "State.gov", "Europa.eu", "Jw.org", "Biblegateway.com", "Siteadvisor.com", "Answers.yahoo.com", "Irs.gov", "Correios.com.br", "Who.int", "Ancestry.com", "Post.japanpost.jp", "Collegeboard.org", "Un.org", "Ec.europa.eu", "Fao.org", "Worldbank.org", "Cosmopolitan.com", "Slate.com", "Esquire.com", "Match.com", "Legacy.com", "Ssa.gov", "Biblehub.com", "Change.org", "Bbb.org", "Auspost.com.au", "Royalmail.com", "Sulekha.com", "Biography.com", "Ato.gov.au", "Complex.com", "Unesco.org", "Expatriates.com", "Thrillist.com", "Familysearch.org", "Va.gov", "Aarp.org", "Infowars.com", "Companieshouse.gov.uk", "Interpals.net", "Sec.gov", "Snopes.com", "Salon.com", "Plos.org", "Hi5.com", "Soompi.com", "Digg.com", "Menshealth.com"};
            String[] health = {"Nih.gov", "Webmd.com", "Mayoclinic.org", "Who.int", "Cdc.gov", "Psychologytoday.com", "Myfitnesspal.com", "Medlineplus.gov", "Drugs.com", "Medscape.com", "Kaiserpermanente.org", "Niams.nih.gov", "Niddk.nih.gov", "Www.nhs.uk", "Verywellmind.com", "Medicinenet.com", "Nichd.nih.gov", "Bmj.com", "Apa.org", "Nimh.nih.gov", "Kidshealth.org", "Fda.gov", "Menshealth.com", "Niaaa.nih.gov", "Emedicine.medscape.com", "Clevelandclinic.org", "Self.com", "Weightwatchers.com", "Verywellhealth.com", "Nia.nih.gov", "Healthgrades.com", "Health.com", "Rxlist.com", "Heart.org", "Fragrantica.com", "Verywellfit.com", "Sdsu.edu", "Hopkinsmedicine.org", "Cancer.gov", "Mercola.com", "Cancer.org", "Nejm.org", "Clinicaltrials.gov", "Zocdoc.com", "Nidcr.nih.gov", "Vitals.com", "Goodrx.com", "Thelancet.com", "Plannedparenthood.org", "Rfs.nsw.gov.au"};
            String[] home = {"Finance.yahoo.com", "Yelp.com,Cnbc.com", "Gsmarena.com", "Theverge.com", "Marketwatch.com", "Engadget.com", "Irs.gov", "Digitaltrends.com", "Allrecipes.com", "Gizmodo.com", "Trustpilot.com", "Instructables.com", "Tomsguide.com", "Travel.state.gov", "Fool.com", "Goodhousekeeping.com", "Tomshardware.com", "Kbb.com", "Edmunds.com", "Healthcare.gov", "Dpreview.com", "Ssa.gov", "Bankrate.com", "Bbb.org", "Consumerreports.org", "Babycenter.com", "Thespruce.com", "Carfax.com", "Thespruceeats.com", "Fixya.com", "Thekitchn.com", "Food.com", "Lifehack.org", "Bonappetit.com", "Hgtv.com", "Countryliving.com", "Bhg.com", "Mouthshut.com", "Bgr.com", "Money.cnn.com", "Opendns.com", "Mint.com", "Ehow.com", "Epicurious.com", "Realsimple.com", "Wonderhowto.com", "Phonearena.com", "Youneedabudget.com", "Theasianparent.com"};
            String[] kids = {"Translate.google.com", "Thesaurus.com", "Reverso.net", "Weebly.com", "Khanacademy.org", "Espncricinfo.com", "Britannica.com", "Leagueoflegends.com", "Timeanddate.com", "Epicgames.com", "Battle.net", "Ea.com", "Xe.com", "Scratch.mit.edu", "Blizzard.com", "Y8.com", "Xbox.com", "History.com", "Citationmachine.net", "Nintendo.com", "Howstuffworks.com", "Bulbagarden.net", "Developer.android.com", "Codecademy.com", "Easports.com", "Mathsisfun.com", "Lego.com", "Bartleby.com", "Sciencedaily.com", "Bom.gov.au", "Ubisoft.com", "Easybib.com", "Pbskids.org", "Fontsquirrel.com", "Bungie.net", "Sitepoint.com", "Uefa.com", "Fafsa.ed.gov", "Biography.com", "Raspberrypi.org", "Mathway.com", "Pokemon.com", "Css-tricks.com", "Kidshealth.org", "Rhymezone.com", "Irishtimes.com", "Square-enix.com", "Space.com", "Activision.com", "Phet.colorado.edu"};
            String[] news = {"Reddit.com", "Nytimes.com", "News.google.com", "Cnn.com", "Theguardian.com", "Shutterstock.com", "Indiatimes.com", "Washingtonpost.com", "News.yahoo.com", "Forbes.com", "Foxnews.com", "Weather.com", "Timesofindia.indiatimes.com", "Economictimes.indiatimes.com", "Cnbc.com", "Bloomberg.com", "Usatoday.com", "Accuweather.com", "Reuters.com", "Chinadaily.com.cn", "Wsj.com", "Chron.com", "Nypost.com", "Nbcnews.com", "Dw.com", "Usnews.com", "Drudgereport.com", "News.com.au", "Wunderground.com", "Hindustantimes.com", "Cbsnews.com", "Time.com", "Indianexpress.com", "Thehindu.com", "Weather.gov", "Sfgate.com", "Thehill.com", "Abcnews.go.com", "Thedailybeast.com", "Newsweek.com", "Livemint.com", "Latimes.com", "Irna.ir", "Theatlantic.com", "Nationalgeographic.com", "Alarabiya.net", "Euronews.com", "Patch.com", "Hollywoodreporter.com", "Mathrubhumi.com", "Collegemagazine.com", "Thecrimson.com", "Newsroom.ucla.edu", "Stanforddaily.com", "Cornellsun.com", "Dailycal.org", "Collegian.psu.edu", "Yaledailynews.com", "Dailybruin.com", "Collegian.com", "News.usc.edu", "Michigandaily.com", "Thelantern.com", "Alligator.org", "Thedailyaztec.com", "News.cornell.edu", "Thedp.com", "Dukechronicle.com", "News.berkeley.edu", "Dailyillini.com", "Columbiaspectator.com", "Dailyorange.com", "Onwardstate.com", "Studlife.com", "Redandblack.com", "Dailynorthwestern.com", "News.wisc.edu", "Universe.byu.edu", "Today.duke.edu", "Iowastatedaily.com", "Dailytrojan.com", "Idsnews.com", "Statepress.com", "Thehoya.com", "Dailytexanonline.com", "Oudaily.com", "Nyunews.com", "Browndailyherald.com", "Ucsdnews.ucsd.edu", "Dailyuw.com", "Dailytarheel.com", "Thevarsity.ca", "Cavalierdaily.com", "Chicagomaroon.com", "Theboar.org", "Mndaily.com", "Ndsmcobserver.com", "Dailyiowan.com", "Pittnews.com", "Purdueexponent.org"};
            String[] travel = {"Booking.com", "Tripadvisor.com", "9gag.com", "Agoda.com", "Expedia.com", "Hotels.com", "Marriott.com", "Zomato.com", "Xe.com", "Uber.com", "Kayak.com", "Aa.com", "Delta.com", "Southwest.com", "Ryanair.com", "Trivago.com", "United.com", "Hilton.com", "Flightradar24.com", "Travel.state.gov", "Ana.co.jp", "Priceline.com", "Emirates.com", "Jal.co.jp", "Vrbo.com", "Skyscanner.com", "Easyjet.com", "Qatarairways.com", "Lonelyplanet.com", "Lego.com", "Timeout.com", "Turkishairlines.com", "Loc.gov", "Ford.com", "Grubhub.com", "Orbitz.com", "Travelocity.com", "Hyatt.com", "Hotwire.com", "Tripsavvy.com", "Accorhotels.com", "Aeroflot.ru", "Aircanada.com", "Lufthansa.com", "Britishairways.com", "Jalopnik.com", "Couchsurfing.com", "Cracked.com", "Opentable.com", "Caranddriver.com", "Disneyworld.disney.go.com", "Rrpicturearchives.net", "Railpictures.net", "Trainorders.com", "Railpage.com.au", "Thedieselshop.us", "Stationroadsteam.com", "Strasburgrailroad.com", "Gyermekvasut.hu", "American-rails.com", "Newhoperailroad.com", "Railroad.net", "Amtraktrains.com", "Cnwhs.org", "Wnxx.com", "Irvineparkrailroad.com", "Trainsri.com", "Rypn.org", "Puffingbilly.com.au", "Emsr.co.uk", "Lirrhistory.com", "Railroadfan.com", "Signalbox.org", "Trainboard.com", "Nnry.com", "Preserved-diesels.co.uk", "Victorianrailways.net", "Nvr.org.uk", "Lner.info", "Sacramentorivertrain.com", "A1steam.com", "Gearedsteam.com", "4qd.co.uk", "Absteamtrain.com", "Nymr.co.uk", "National-preservation.com", "Coloradorailfan.com", "Railway-centre.com", "Mthoodrr.com", "Rmirailworks.com", "Gensheet.co.uk", "Trainweb.com", "Cvsr.com", "Adirondackrr.com", "Freedomtrain.org", "Anthraciterailroads.org", "Gcrailway.co.uk", "Railpace.com", "Verdecanyonrr.com", "Thecrhs.org", "Discoverlivesteam.com"};
            String[] sport = {"Espn.com", "Cricbuzz.com", "Sports.yahoo.com", "Football.fantasysports.yahoo.com", "Espncricinfo.com", "Nfl.com", "Nba.com", "Cbssports.com", "Livescore.com", "Bleacherreport.com", "Flashscore.com", "Premierleague.com", "Nhl.com", "Goal.com", "Strava.com", "Nbcsports.com", "Skysports.com", "Rei.com", "Fantasy.nfl.com", "Filgoal.com", "Basketball-reference.com", "Soccerway.com", "Rotoworld.com", "Maxpreps.com", "Formula1.com", "Foxsports.com", "Uefa.com", "Rivals.com", "Si.com", "Sbnation.com", "Hkjc.com", "Motorsport.com", "Wwe.com", "Fifa.com", "Tsn.ca", "Baseball-reference.com", "Active.com", "Eurosport.com", "Profootballtalk.nbcsports.com", "Hattrick.org", "Whoscored.com", "Pro-football-reference.com", "Sportingnews.com", "Football365.com", "Deadspin.com", "Sherdog.com", "Surfline.com", "Myfantasyleague.com", "Boxrec.com", "Soccerstand.com"};
            String[] entertainment = {"Netflix.com", "Hulu.com", "Vice.com", "Metacritic.com", "Tmz.com", "Rollingstone.com", "Hollywoodreporter.com", "Eonline.com", "Variety.com", "Heavy.com", "Ew.com", "Today.com", "Popsugar.com", "Collider.com", "Avclub.com", "Commonsensemedia.org", "Cinemablend.com", "Etonline.com", "Gawker.com", "Veoh.com", "Spin.com", "Monstersandcritics.com", "Popmatters.com", "Egotastic.com", "Theybf.com", "Hotcelebshome.com", "Vibe.com", "Shockwave.com", "Contactmusic.com", "Pajiba.com", "Pluggedin.com", "Extratv.com", "Windowsmedia.com", "Hitfix.com", "Jumptv.com", "Hollywood.com", "Hecklerspray.com", "Aintitcool.com", "Imbringingbloggingback.com", "Lostateminor.com", "Findsounds.com", "Squidtv.net", "Glidemagazine.com", "Theblemish.com", "Popculturemadness.com", "Pinkisthenewblog.com", "Vizhole.com", "Blogcritics.org", "Lagardere.com", "Thehollywoodnews.com"};
            
            System.out.println();
            if (search.equalsIgnoreCase("shopping")) {

                for (String shop : shopping) {
                    System.out.println(shop);

                }
            } else if (search.equalsIgnoreCase("art")) {
                for (String a : art) {
                    System.out.println(a);
                }
            } else if (search.equalsIgnoreCase("adult")) {
                for (String adu : adult) {
                    System.out.println(adu);
                }
            } else if (search.equalsIgnoreCase("business")) {
                for (String bus : business) {
                    System.out.println(bus);
                }
            } else if (search.equalsIgnoreCase("computer")) {
                for (String com : computer) {
                    System.out.println(com);
                }
            } else if (search.equalsIgnoreCase("game") || search.equalsIgnoreCase("games")) {
                for (String gam : game) {
                    System.out.println(gam);
                }
            } else if (search.equalsIgnoreCase("reference")) {
                for (String ref : reference) {
                    System.out.println(ref);
                }
            } else if (search.equalsIgnoreCase("regional")) {
                for (String reg : regional) {
                    System.out.println(reg);
                }
            } else if (search.equalsIgnoreCase("science")) {
                for (String sci : science) {
                    System.out.println(sci);
                }
            } else if (search.equalsIgnoreCase("society")) {
                for (String soc : society) {
                    System.out.println(soc);
                }
            } else if (search.equalsIgnoreCase("health")) {
                for (String hea : health) {
                    System.out.println(hea);
                }
            } else if (search.equalsIgnoreCase("home")) {
                for (String hom : home) {
                    System.out.println(hom);
                }
            } else if (search.equalsIgnoreCase("kids") || search.equalsIgnoreCase("teens") || search.equalsIgnoreCase("kid") || search.equalsIgnoreCase("teen")) {
                for (String k : kids) {
                    System.out.println(k);
                }
            } else if (search.equalsIgnoreCase("news")) {
                for (String ne : news) {
                    System.out.println(ne);
                }
            } else if (search.equalsIgnoreCase("travel")) {
                for (String tra : travel) {
                    System.out.println(tra);
                }
            } else if (search.equalsIgnoreCase("sport") || search.equalsIgnoreCase("sports")) {
                for (String spo : sport) {
                    System.out.println(spo);
                }
            } else if (search.equalsIgnoreCase("entertainment")) {
                for (String ent : entertainment) {
                    System.out.println(ent);
                }
            }

            
    

        
        
            else if(search.equalsIgnoreCase("convert currency")){
           
           double money,convert;
        String before,after,stat="myr";
    
        System.out.print("From what currency : ");
        before=sc.next();
        System.out.print("To what currency : ");
        after=sc.next();
        System.out.print("Please enter the amount of money to convert: ");
        money = sc.nextDouble();
        if(before.equalsIgnoreCase(stat)||after.equalsIgnoreCase(stat)){
            convert=xcg(money,before,after);
            if(convert!=0){
                System.out.printf("The conversion amount is %.2f",convert);
                System.out.println(" "+after.toUpperCase());
            }
            else
            System.out.println("You enter a wrong conversion unit");
        }
        else{
            
            String x;
            x=after;
            after=stat;
            convert=xcg(money,before,after);
            if(convert==0){
                System.out.println("You enter wrong conversion unit");
            }
            before=stat;
            after=x;
            convert=xcg(convert,before,after);
            if(convert==0){
                
            }
            else{
            System.out.printf("The conversion amount is %.2f",convert);
            System.out.println(" "+after.toUpperCase());
            }
        }
        
    }
            
            
            
            
       
            else  if(search.contains("tic")){
                Random in = new Random();
                 //count for the index of the array
        int random, count = 0;
        //array for not repeating the random number
        int[] singlearray = new int[9];
        int[] multiarray = new int[9];
        //variable for continue the game
        String ans = "Y";
        //gamekey
        char key = 'x', key2 = 'o', win = 'a';
        //check for multiplayer mode
        int num = 0, check = 0;

        System.out.println("                Welcome to Tic Tac Toe");
        while (ans.equalsIgnoreCase("Y")) {
            System.out.println("         (Mode 1: Single)    (Mode 2: Multiplayer)");
            System.out.println("Select the game mode(Click 1 for Mode 1) or (Click 2 for Mode 2): ");
            int gamemode = sc.nextInt();
            while (gamemode != 1 && gamemode != 2) {
                System.err.println("Please enter a valid gamemode");
                System.out.println("Select the game mode(Click 1 for Mode 1) or (Click 2 for Mode 2):");
                gamemode = sc.nextInt();
            }

            //for displaying the number at the position in the gameboard
            char[][] array = {{'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}};

            //code for single player
            if (gamemode == 1) {
                System.out.println("Enter Player's name: ");
                String singlename = sc.next();

                //choosing key
                System.out.println(singlename + " please select X or O: ");
                key = sc.next().charAt(0);

                if (key == 'X' || key == 'x') {
                    key = 'X';

                } else if (key == 'O' || key == 'o') {
                    key = 'O';
                }
                //displaying the game board
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + "    ");
                    }
                    System.out.println("");
                }
                //       line1                                                       // line2                                                         //line3                                                      // column1                                                         //column2                                                //column3                                                   //diagonal1                                               //diagonal2                                     

                while ((array[0][0] != array[0][1] || array[0][1] != array[0][2]) && (array[1][0] != array[1][1] || array[1][1] != array[1][2]) && (array[2][0] != array[2][1] || array[2][1] != array[2][2]) && (array[0][0] != array[1][0] || array[1][0] != array[2][0]) && (array[0][1] != array[1][1] || array[1][1] != array[2][1]) && (array[0][2] != array[1][2] || array[1][2] != array[2][2]) && (array[0][0] != array[1][1] || array[1][1] != array[2][2]) && (array[2][0] != array[1][1] || array[1][1] != array[0][2])) {
                    System.out.println("\n\n" + singlename + "'s turn\n");
                    System.out.println("Press a number from 1 to 9 to draw your " + key);
                    num = sc.nextInt();

                    while (true) {

                        boolean isInArray = false;
                        for (int i = 0; i < singlearray.length; i++) {
                            if (num == singlearray[i]) {
                                isInArray = true;
                                break;
                            }
                        }
                        if (isInArray) {
                            System.err.println("The number you entered is already been taken");
                            System.out.println("Please enter other number: ");
                            num = sc.nextInt();
                            continue;
                        } else {
                            singlearray[count] = num;
                            count++;
                            break;
                        }
                    }

                    //drawing the key at position selected by user
                    if (key == 'X') {
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                        //COMPUTER'S TURN
                        System.out.println("\n\n Computer's turn\n");

                        //for not repeating the same number
                        while (true) {
                            random = in.nextInt(9);

                            boolean isInArray = false;
                            for (int i = 0; i < singlearray.length; i++) {
                                if (random == singlearray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                continue;
                            } else {
                                singlearray[count] = random;
                                count++;
                                break;
                            }
                        }
                        //drawing key at random position generated by computer
                        switch (random) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identiy winner
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }
                        //vice versa if key is O
                    } else if (key == 'O') {
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }
                        //COMPUTER'S TURN
                        System.out.println("\n\n Computer's turn\n");
                        random = in.nextInt(9);
                        //for not repeating the same number
                        while (true) {
                            random = in.nextInt(9);

                            boolean isInArray = false;
                            for (int i = 0; i < singlearray.length; i++) {
                                if (random == singlearray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                continue;
                            } else {
                                singlearray[count] = random;
                                count++;
                                break;
                            }
                        }

                        switch (random) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                    }
                }
                //to identify the winner
                if (win == key) {
                    System.out.println("Congratulation " + singlename + ". U won");
                } else {
                    System.out.println("Computer won\nBetter luck next time");
                }
            }
            //code for multiplayer mode
            if (gamemode == 2) {
                count = 0;
                System.out.println("Enter Player 1's Name: ");
                String name = sc.next();
                System.out.println("Enter Player 2's Name: ");
                String name2 = sc.next();

                //randomly generating the turn of players
                int dice = in.nextInt(2);

                if (dice == 0) {
                    //asking the player with first turn to select first
                    System.out.println(name + " please select X or O: ");
                    key = sc.next().charAt(0);

                    if (key == 'X' || key == 'x') {
                        key = 'X';
                        key2 = 'O';
                        check = 1;
                    } else if (key == 'O' || key2 == 'o') {
                        key = 'O';
                        key2 = 'X';
                        check = 2;
                    }

                } else if (dice == 1) {
                    //asking the player with first turn to select first
                    System.out.println(name2 + " please select X  or O");
                    key2 = sc.next().charAt(0);

                    if (key2 == 'X' || key2 == 'x') {
                        key2 = 'X';
                        key = 'O';
                        check = 1;
                    } else if (key2 == 'O' || key2 == 'o') {
                        key2 = 'O';
                        key = 'X';
                        check = 2;
                    }
                }

                //displaying the gameboard
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + "    ");
                    }
                    System.out.println("");
                }
                //       line1                                                       // line2                                                         //line3                                                      // column1                                                         //column2                                                //column3                                                   //diagonal1                                               //diagonal2                                     
                while ((array[0][0] != array[0][1] || array[0][1] != array[0][2]) && (array[1][0] != array[1][1] || array[1][1] != array[1][2]) && (array[2][0] != array[2][1] || array[2][1] != array[2][2]) && (array[0][0] != array[1][0] || array[1][0] != array[2][0]) && (array[0][1] != array[1][1] || array[1][1] != array[2][1]) && (array[0][2] != array[1][2] || array[1][2] != array[2][2]) && (array[0][0] != array[1][1] || array[1][1] != array[2][2]) && (array[2][0] != array[1][1] || array[1][1] != array[0][2])) {
                    //POSIBILITY1 (if first player select x)
                    if (check == 1) {
                        //if player1 start first(to display their name first)
                        if (dice == 0) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();

                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                            //if player2 start first(to display their anme first)
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();
                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                        }
                        //drawing the key
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                        //if player2 start first(to display player2's name first)
                        if (dice == 0) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();
                            while (true) {

                                boolean isInArray = false;
                                for (int i = 0; i < multiarray.length; i++) {
                                    if (num == multiarray[i]) {
                                        isInArray = true;
                                        break;
                                    }
                                }
                                if (isInArray) {
                                    System.err.println("The number you entered is already been taken");
                                    System.out.println("Please enter other number: ");
                                    num = sc.nextInt();
                                    continue;
                                } else {
                                    multiarray[count] = num;
                                    count++;
                                    break;
                                }
                            }
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();
                             while (true) {
                           

                            boolean isInArray = false;
                            for (int i = 0; i < multiarray.length; i++) {
                                if (num == multiarray[i]) {
                                    isInArray = true;
                                    break;
                                }
                            }
                            if (isInArray) {
                                System.err.println("The number you entered is already been taken");
                                System.out.println("Please enter other number: ");
                                num=sc.nextInt();
                                continue;
                            } else {
                                multiarray[count] = num;
                                count++;
                                break;
                            }
                        }
                        }

                        //drawing the key
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify the winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'O';
                            break;

                        }//POSIBILITY2(if first player select o)  
                    } else if (check == 2) {
                        if (dice == 0) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key);
                            num = sc.nextInt();
                            //if player2 start first(to display the name of player2) 
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your " + key2);
                            num = sc.nextInt();

                        }
                        //drawing the key on board
                        switch (num) {
                            case 1:
                                array[0][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'O';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {

                            win = 'O';
                            break;
                        }
                        if (dice == 0) {
                            //to display the name of next player
                            System.out.println("\n\n" + name2 + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your");
                            num = sc.nextInt();
                        } else if (dice == 1) {
                            System.out.println("\n\n" + name + "'s turn\n");
                            System.out.println("Press a number from 1 to 9 to draw your");
                            num = sc.nextInt();

                        }
                        //to draw key on board
                        switch (num) {
                            case 1:
                                array[0][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 2:
                                array[0][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 3:
                                array[0][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 4:
                                array[1][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 5:
                                array[1][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 6:
                                array[1][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 7:
                                array[2][0] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 8:
                                array[2][1] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            case 9:
                                array[2][2] = 'X';
                                for (char[] array1 : array) {
                                    for (int j = 0; j < array.length; j++) {
                                        System.out.print(array1[j] + "    ");
                                    }
                                    System.out.println("");
                                }
                                break;
                            default:
                                break;
                        }
                        //to identify winner & stop the game
                        if ((array[0][0] == array[0][1] && array[0][1] == array[0][2]) || (array[1][0] == array[1][1] && array[1][1] == array[1][2]) || (array[2][0] == array[2][1] && array[2][1] == array[2][2]) || (array[0][0] == array[1][0] && array[1][0] == array[2][0]) || (array[0][1] == array[1][1] && array[1][1] == array[2][1]) || (array[0][2] == array[1][2] && array[1][2] == array[2][2]) || (array[0][0] == array[1][1] && array[1][1] == array[2][2]) || (array[2][0] == array[1][1] && array[1][1] == array[0][2])) {
                            win = 'X';
                            break;
                        }
                    }
                }
                //declaring the winner
                if (win == key) {
                    System.out.println(name + " won the game");
                } else if (win == key2) {
                    System.out.println(name2 + " won the game");
                }
            }
            //asking to continue
            System.out.println("Do you want to continue the game?(Y for Yes or N for No): ");
            ans = sc.next();
            //if user enter invalid answer
            while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")) {

                System.err.println("Please enter a valid answer");

                System.out.println("Do you want to continue the game?(Y for Yes or N for No): ");
                ans = sc.next();
            }
        }
        System.out.println("Game Over");
            }
            
            
            
            
            
            else if (search.contains("roll")){
                String a;
        int x;
        dice d = new dice();
        System.out.print("Dice Roller(Enter a Sentence : Roll dice N times) : ");
        a=sc.nextLine();
        String[] b = a.split(" ");
        if(b.length==3){
            if(b[0].equalsIgnoreCase("roll")&&b[1].equalsIgnoreCase("a")&&b[2].equalsIgnoreCase("dice")){
                d.setNumberOfRoll("1");
                d.totalValueDice();
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else if(b.length==4){
            if(b[0].equalsIgnoreCase("roll")&&b[1].equalsIgnoreCase("a")&&b[2].equalsIgnoreCase("dice")){
                if(b[3].equalsIgnoreCase("twice")||b[3].equalsIgnoreCase("thrice")){
                    d.identifyRoll(b[3]);
                    d.totalValueDice();
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else if(b[0].equalsIgnoreCase("roll")&&b[1].equalsIgnoreCase("dice")){
                if(b[3].equalsIgnoreCase("times")||b[3].equalsIgnoreCase("time")){
                    if(d.numOrNot(b[2])){
                        d.setNumberOfRoll(b[2]);
                        d.totalValueDice();
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        
            }
            
            
            else if(search.contains("guess")){
                Random r = new Random();
                
 int computer1;
 String user;
 String winner;
 String numToWord = "";


String exit = "";

while(!exit.equalsIgnoreCase("yes")) {
    computer1 = r.nextInt(1001);
    System.out.println("Guess the number from 0-1000");
    user=sc.nextLine();
    convert();
    if (user.equalsIgnoreCase(numToWord))
        System.out.println("It's a Correct Guess");
    else
        System.out.println("It's a Wrong Guess");
    
    System.out.println("exit=yes/no");
    exit=sc.nextLine();
    
}
            }
            
            
            else if(search.contains("+") || search.contains("-")||search.contains("*") || search.contains("/")){
                
    
                String strinput=search;
                double ans = Operation(strinput);
                System.out.println("Answer is: " + ans);
                System.out.println("Thank you for using Googol calculator!!! ");
            
            }
          
    
                
            else if(search.contains("binomial")){
                
                 System.out.println("Enter the integer according to the formula (A+X)^n ");
                 System.out.println("For A :");
                 int A = sc.nextInt();
                 System.out.println("For X :");
                 int X = sc.nextInt();
                 System.out.println("For n :");
                 int n = sc.nextInt();
          
        Formula(A, X, n); 
            }
            
            
            
            
           else{
                while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(search)) {

                    System.out.println(line);

                }
            }
            }
            /* always close the file after use */
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file ");
        }
           
           
           
       }
    
    public static double xcg(double a,String b,String c){
        
        double rate,x;
        rate=perc(b,c);
        if(rate!=0)
            x=a*rate;
        else
            x=0;
        
        return x;
    }
    
    public static double perc(String a,String b){
        
        double y=0;
        try{
            
            Scanner s = new Scanner(new FileInputStream("C://Users/imran/My Project/Googol/currencyData.txt"));
            stop:
            while(s.hasNextLine()){
                if(s.next().equalsIgnoreCase(a)&&s.next().equalsIgnoreCase(b)){
                    y=s.nextDouble();
                    break stop;
                }
                if(s.hasNextLine()==false){
                    y=0;
                    break stop;
                }
            }
            
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        return y;
    }
              
    } 

class dice {
    
    Random d = new Random();
    
    private String numberOfRoll;
    private int noOfDice;
    private int[] dice;
    
    public dice(){
        numberOfRoll="";
        noOfDice=0;
    }

    public dice(String numberOfRoll) {
        this.numberOfRoll = numberOfRoll;
    }

    public String getNumberOfRoll() {
        return numberOfRoll;
    }
    
    public int getNoOfDice(){
        return noOfDice;
    }

    public void setNumberOfRoll(String numberOfRoll) {
        this.numberOfRoll = numberOfRoll;
    }
    
    public void setNoOfDice(int noOfDice){
        this.noOfDice=noOfDice;
    }
    
    public void identifyRoll(String numberOfRoll){
        if(numberOfRoll.equalsIgnoreCase("twice")){
            numberOfRoll="2";
            this.numberOfRoll=numberOfRoll;
        }
        else if(numberOfRoll.equalsIgnoreCase("thrice")){
            numberOfRoll="3";
            this.numberOfRoll=numberOfRoll;
        }
    }
    
    public void totalValueDice(){
        int x=0,i=0;
        if(noOfDice==0){
            x=Integer.parseInt(numberOfRoll);
        }
        else if(numberOfRoll.equalsIgnoreCase("")){
            x=noOfDice;
        }
        int[] dice = new int[x];
        do{
            dice[i]=d.nextInt(6)+1;
            i++;
        }while(i<x);
        int sum=0;
        for(i=0;i<dice.length;i++){
            System.out.println("Dice "+(i+1)+" : "+dice[i]);
            sum+=dice[i];
            if(i+1==dice.length)
                System.out.println("The total of the roll(s) is "+sum);
        }
    }
    
    public boolean numOrNot(String x){
        try{
            Double.parseDouble(x);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
