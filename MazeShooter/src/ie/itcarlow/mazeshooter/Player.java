package ie.itcarlow.mazeshooter;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.Texture;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;

public class Player 
{
	private float m_positionX;
	private float m_positionY;
	private Sprite m_sprite;
	//private Texture m_texture;
	private BitmapTextureAtlas m_texture;
	private ITextureRegion m_textureRegion;
	
	void Player()	//Default constructor
	{
		m_positionX = 100;
		m_positionY = 100;
		
		LoadAssits();
	}
	
	public void LoadAssits()
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Player/");  
		m_texture = new BitmapTextureAtlas(getTextureManager(), 64, 64);  
		m_textureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(m_texture, this, "player.png", 0, 0);
        m_texture.load();
	}
	
	public void Update()
	{
				
	}
	
	public void Draw()
	{
		
	}
	
	
	//Getters & Setters
	//--------------------------------------------------------------------
	public Sprite getSprite()	{return m_sprite;}
	public float getPositionX()	{return m_positionX;}
	public float getPositionY()	{return m_positionY;}
}
