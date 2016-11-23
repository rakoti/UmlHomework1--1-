package JavaPackage;

import UmlPackage.Citizens;
import UmlPackage.Country;
import UmlPackage.Elections;
import UmlPackage.Goverment;
import UmlPackage.LocalElections;
import UmlPackage.LocalGoverment;
import UmlPackage.NationalElection;
import UmlPackage.NationalGoverment;

import UmlPackage.PoliticalParty;
import UmlPackage.Politicians;
import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.LeftMost;
import hu.elte.txtuml.api.layout.RightMost;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.TopMost;

public class Homework1 extends ClassDiagram{
	
	
	@Column({Country.class, Politicians.class})
	@Column({Elections.class, Citizens.class})
	@Row ({Goverment.class, Politicians.class, Citizens.class})
	@Row ({Elections.class, PoliticalParty.class})
	@Row ({NationalElection.class, NationalGoverment.class})
	@Row ({LocalElections.class, LocalGoverment.class})
	class HomeLayout extends Layout {}
}
